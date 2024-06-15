// Aguarda o evento de carregamento completo do DOM antes de executar o código interno
document.addEventListener("DOMContentLoaded", function() {
    // Obtém referências para os elementos de luz vermelha, amarela e verde pelo ID
    const redLight = document.getElementById('red');
    const yellowLight = document.getElementById('yellow');
    const greenLight = document.getElementById('green');
    
    // Variável para controlar qual luz está ativa no momento (0 para vermelho, 1 para amarelo, 2 para verde)
    let currentLight = 0;
    // Array que contém as referências para os elementos de luz na ordem: vermelho, amarelo, verde
    const lights = [redLight, yellowLight, greenLight];

    // Função para alternar as luzes
    function changeLight() {
        // Remove a classe 'active' de todas as luzes
        lights.forEach(light => light.classList.remove('active'));
        // Adiciona a classe 'active' à luz atualmente ativa
        lights[currentLight].classList.add('active');
        // Atualiza o índice da luz atual para a próxima luz no ciclo (vermelho -> amarelo -> verde -> vermelho)
        currentLight = (currentLight + 1) % lights.length;
        //Incrementa o valor de currentLight para apontar para a próxima luz no ciclo. O operador % (módulo) garante que o índice permaneça dentro dos limites do array lights, permitindo um ciclo contínuo: vermelho -> amarelo -> verde -> vermelho.
    }

    // Chama a função changeLight uma vez para inicializar o semáforo
    changeLight();
    // Configura um intervalo para chamar a função changeLight a cada 2 segundos (2000 milissegundos)
    setInterval(changeLight, 2000);  // altera em  2 segundos
});