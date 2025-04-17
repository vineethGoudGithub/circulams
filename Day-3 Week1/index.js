
const button = document.querySelector("button");
button.addEventListener("click", function() {

  document.body.classList.toggle("dark-mode");

  if (document.body.classList.contains("dark-mode")) {

    button.textContent = "Switch to Light Mode";    
    button.style.backgroundColor = "violet"; 
  } else {
    button.textContent = "Switch to Dark Mode";
    button.style.backgroundColor = "blue";
    button.style.color="white";
    
  }
});
