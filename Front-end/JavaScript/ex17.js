// script.js
const questions = [
  {
    question: "how many days are there in a week",
    options: [5,6,7,8],
    answer: 7
  },
  {
    question: "Who won ICC Cricket World Cup 2011?",
    options: ["India","England","Austrila","sri Lanka"],
    answer: "India"
  },
  {
    question: "who is the winning captian of IPL 2021?",
    options: [
      "Rohit Sharma",
      "Virat Kholi",
      "MS Dhoni",
      "KL Rahul"
    ],
    answer: "MS Dhoni"
  }
];

let currentQuestion = 0;
let score = 0;

const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const feedbackEl = document.getElementById("feedback");
const nextBtn = document.getElementById("next-btn");
const scoreEl = document.getElementById("score");

function loadQuestion() {
  const q = questions[currentQuestion];
  questionEl.textContent = q.question;
  optionsEl.innerHTML = "";
  feedbackEl.textContent = "";

  q.options.forEach(option => {
    const btn = document.createElement("button");
    btn.textContent = option;
    btn.onclick = () => checkAnswer(option);
    optionsEl.appendChild(btn);
  });
}

function checkAnswer(selected) {
  const correct = questions[currentQuestion].answer;
  if (selected === correct) {
    feedbackEl.textContent = "✅ Correct!";
    score++;
  } else {
    feedbackEl.textContent = "❌ Wrong!";
  }
  scoreEl.textContent = `Score: ${score}`;
  Array.from(optionsEl.children).forEach(btn => btn.disabled = true);
}

nextBtn.onclick = () => {
  currentQuestion++;
  if (currentQuestion < questions.length) {
    loadQuestion();
  } else {
    questionEl.textContent = "Quiz Completed!";
    optionsEl.innerHTML = "";
    feedbackEl.textContent = `Final Score: ${score}/${questions.length}`;
    nextBtn.disabled = true;
  }
};

loadQuestion();