document.addEventListener("DOMContentLoaded", function() {

    // Gerar um array de 20 cores aleatórias
    const colors = Array.from({ length: 20 }, getRandomColor);

    // Array de imagens de pessoas na rave
    const images = [
        'image01.jpg',
        'image02.jpg',
        'image03.jpg',
        'image04.jpg'
    ];

    let currentColor = 0;
    let currentImage = 0;

    // Função para mudar a cor de fundo do body
    function changeBackgroundColor() {
        document.body.style.backgroundColor = colors[currentColor];
        currentColor = (currentColor + 1) % colors.length;
    }

    // Função para mudar a imagem da rave
    function changeImage() {
        const imageElement = document.getElementById('rave-image');
        imageElement.src = images[currentImage];
        currentImage = (currentImage + 1) % images.length;
    }

    // Selecionar o áudio e o botão
    const audio = document.getElementById('rave-audio');
    const button = document.getElementById('start-rave');

    // Adicionar evento de clique ao botão para iniciar a rave
    button.addEventListener('click', function() {
        audio.play();
        button.style.display = 'none'; // Esconder o botão após o clique
        setInterval(changeBackgroundColor, 500); // Iniciar a mudança de cores
        setInterval(changeImage, 1000); // Iniciar a mudança de imagens
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
