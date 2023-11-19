// Esta função é chamada quando o formulário é submetido
function calculate(event) {
    // Impede o comportamento padrão do formulário, que seria recarregar a página
    event.preventDefault();

    // Obtém os valores dos campos de entrada num1, num2 e operador
    var num1 = parseFloat(document.getElementById('num1').value);
    var num2 = parseFloat(document.getElementById('num2').value);
    var operator = document.getElementById('operator').value;
    var result; // Variável para armazenar o resultado da operação

    // Usa uma instrução switch para realizar diferentes operações com base no operador selecionado
    switch (operator) {
        // Caso o operador seja 'add' (adição), realiza a operação de adição
        case 'add':
            result = num1 + num2;
            break;
        // Caso o operador seja 'subtract' (subtração), realiza a operação de subtração
        case 'subtract':
            result = num1 - num2;
            break;
        // Caso o operador seja 'multiply' (multiplicação), realiza a operação de multiplicação
        case 'multiply':
            result = num1 * num2;
            break;
        // Caso o operador seja 'divide' (divisão), realiza a operação de divisão
        case 'divide':
            // Verifica se o segundo número (num2) é diferente de zero para evitar a divisão por zero
            if (num2 !== 0) {
                result = num1 / num2;
            } else {
                // Se num2 for zero, exibe uma mensagem indicando que a divisão por zero não é possível
                result = 'Não é possível dividir por zero';
            }
            break;
        // Caso nenhum operador válido seja selecionado, define o resultado como uma mensagem indicando
        // que é necessário selecionar uma operação
        default:
            result = 'Selecione uma operação';
            break;
    }

    // Exibe o resultado na página, dentro do elemento com o ID 'result'
    document.getElementById('result').innerText = 'Resultado: ' + result;
}