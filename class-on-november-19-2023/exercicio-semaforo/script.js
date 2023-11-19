const redLight = document.querySelector('.red');
const yellowLight = document.querySelector('.yellow');
const greenLight = document.querySelector('.green');

function changeLights() {
  setTimeout(() => {
    redLight.style.opacity = 1;
    yellowLight.style.opacity = 0.3;
    greenLight.style.opacity = 0.3;
  }, 0);

  setTimeout(() => {
    redLight.style.opacity = 0.3;
    yellowLight.style.opacity = 1;
    greenLight.style.opacity = 0.3;
  }, 4000);

  setTimeout(() => {
    redLight.style.opacity = 0.3;
    yellowLight.style.opacity = 0.3;
    greenLight.style.opacity = 1;
  }, 7000);

  setTimeout(changeLights, 10000);
}

changeLights();
