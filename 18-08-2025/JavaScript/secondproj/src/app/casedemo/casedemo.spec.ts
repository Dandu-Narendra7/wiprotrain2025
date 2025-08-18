import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Casedemo } from './casedemo';

describe('Casedemo', () => {
  let component: Casedemo;
  let fixture: ComponentFixture<Casedemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Casedemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Casedemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
