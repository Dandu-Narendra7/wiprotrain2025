import { Component, EventEmitter, Input, Output } from '@angular/core';
import { TaskList } from '../task-list/task-list';
import { Home } from '../home/home';

@Component({
  selector: 'app-task',
  imports: [],
  templateUrl: './task.html',
  styleUrl: './task.css'
})
export class Task {

    @Input() task!: Task;
    @Output() delete = new EventEmitter<number>();
    id: any;
    description: any;
    category: any;
  

  remove() {
    this.delete.emit(this.task.id);
  }


}
