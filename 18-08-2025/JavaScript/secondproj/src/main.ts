import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Listmodel } from './app/listmodel/listmodel';
import { Conditioncom } from './app/conditioncom/conditioncom';
import { Casedemo } from './app/casedemo/casedemo';
import { Ex14search } from './app/ex14search/ex14search';
import { Ex15book } from './app/ex15book/ex15book';

bootstrapApplication(Ex15book, appConfig)
  .catch((err) => console.error(err));
