document.addEventListener("DOMContentLoaded", function() {
    const colors = [
        "#FF5733", "#33FF57", "#3357FF", "#FF33A1", "#33FFF2",
        "#F2FF33", "#A133FF", "#FF8C33", "#33FF8C", "#3380FF",
        "#FF5733", "#57FF33", "#FF3357", "#33A1FF", "#F2A133",
        "#8C33FF", "#FF33D1", "#33FFD1", "#D1FF33", "#5733FF"
    ];

    // Gerar um array de 20 cores aleatórias
    const colors1 = Array.from({ length: 50 }, getRandomColor);
    console.log(colors1);

    let currentColor = 0;

    function changeBackgroundColor() {
        document.body.style.backgroundColor = colors1[currentColor];
        currentColor = (currentColor + 1) % colors1.length;
    }

    setInterval(changeBackgroundColor, 500);

    // const audio = document.getElementById('rave-audio');
    // audio.play();

    // Selecionar o áudio e o botão
    const audio = document.getElementById('rave-audio');
    const button = document.getElementById('start-rave');

    // Adicionar evento de clique ao botão para iniciar a rave
    button.addEventListener('click', function() {
        audio.play();
        button.style.display = 'none'; // Esconder o botão após o clique
        setInterval(changeBackgroundColor, 500); // Iniciar a mudança de cores
    });
});


// Função para gerar uma cor aleatória em formato hexadecimal
function getRandomColor() {
    const letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}
