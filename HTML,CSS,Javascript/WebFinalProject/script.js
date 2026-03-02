// Highlight pet row when clicked
const rows = document.querySelectorAll("table tr");
rows.forEach((row, index) => {
  if (index === 0) return; // skip header row
  row.addEventListener("click", () => {
    rows.forEach(r => r.classList.remove("highlight"));
    row.classList.add("highlight");
  });
});

// Video play/pause toggle
const video = document.getElementById("shelterVideo");
const toggleBtn = document.getElementById("toggleVideo");
toggleBtn.addEventListener("click", () => {
  if (video.paused) {
    video.play();
    toggleBtn.textContent = "Pause Video";
  } else {
    video.pause();
    toggleBtn.textContent = "Play Video";
  }
});

// Adoption form validation and confirmation
const form = document.getElementById("adoptionForm");
const confirmation = document.getElementById("confirmationMessage");

form.addEventListener("submit", (e) => {
  e.preventDefault();

  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const pet = document.getElementById("pet").value;

  if (!name || !email || !pet) {
    alert("Please fill out all fields correctly.");
    return;
  }

  confirmation.textContent = `Thank you, ${name}! Your request to adopt ${pet} has been received.`;
  form.reset();
});