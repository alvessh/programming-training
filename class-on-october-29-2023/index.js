function validarIdade() {
    let inputValue = document.getElementById("idade").value;

    console.log("Idade:" + inputValue);

    if (inputValue < 13) {
        alert("Você é uma criança.");
    } else if (inputValue >= 13 && inputValue < 18) {
        alert("Você é um adolescente.");
    } else if (inputValue >= 65) {
        alert("Você é um idoso.");
    } else {
        alert("Você é um adulto.");
    }
}