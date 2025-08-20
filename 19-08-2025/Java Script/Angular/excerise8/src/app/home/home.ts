import { Component } from '@angular/core';
import { FormsModule, NgModel } from '@angular/forms';
import { Task } from '../task/task';
import { TaskList } from "../task-list/task-list";
@Component({
  selector: 'app-home',
  imports: [FormsModule, TaskList],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  tasks:Task[]=[];
  newDescription:string='';
  newCategory:string='work';
  addTask(){
    const newTask: Task={
      description: this.newDescription,
      category: this.newCategory,
    };
      this.tasks.push(newTask);
      this.newDescription = '';
      this.newCategory = 'Work';

  }
   deleteTask(id: number) {
    this.tasks = this.tasks.filter(task => task.id !== id);
  }


}
