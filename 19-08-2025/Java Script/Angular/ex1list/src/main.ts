import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Fruitlist } from './app/fruitlist/fruitlist';
import { Exercise2 } from './app/exercise2/exercise2';

bootstrapApplication(Exercise2, appConfig)
  .catch((err) => console.error(err));
