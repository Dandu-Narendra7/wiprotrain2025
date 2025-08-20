import { Component, Input, Output,EventEmitter } from '@angular/core';
import { Task } from '../task/task';

@Component({
  selector: 'app-task-list',
  imports: [Task],
  templateUrl: './task-list.html',
  styleUrl: './task-list.css'
})
export class TaskList {
  @Input() tasks: Task[]=[];
  @Output() remove=new EventEmitter<number>();
  onDelete(id: number) {
    this.remove.emit(id);
  }


}
