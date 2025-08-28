import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex2form } from './app/ex2form/ex2form';
import { Ex4sub } from './app/ex4sub/ex4sub';
import { Ex5forms } from './app/ex5forms/ex5forms';

bootstrapApplication(Ex5forms, appConfig)
  .catch((err) => console.error(err));
