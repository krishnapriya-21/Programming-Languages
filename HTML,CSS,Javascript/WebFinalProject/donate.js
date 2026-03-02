// Handle donation form submission
const donationForm = document.getElementById("donationForm");
const donationMessage = document.getElementById("donationMessage");

donationForm.addEventListener("submit", (e) => {
  e.preventDefault(); // Prevent page reload

  const name = document.getElementById("donorName").value.trim();
  const email = document.getElementById("donorEmail").value.trim();
  const amount = document.getElementById("amount").value;

  // Simple validation
  if (!name || !email || !amount) {
    alert("Please fill out all fields correctly.");
    return;
  }

  // Confirmation message
  donationMessage.textContent = `Thank you, ${name}! Your generous donation of $${amount} has been received.`;

  // Clear form after submission
  donationForm.reset();
});