function addTask() {
    let taskValue = document.getElementById("task").value;
    if (taskValue === "") return;
    let li = document.createElement("li");
    li.textContent = taskValue;
    let removeButton = document.createElement("button");
    removeButton.textContent = "Remove";
    removeButton.onclick = () => li.remove();
    li.appendChild(removeButton);
    document.getElementById("taskList").appendChild(li);
}