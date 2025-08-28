import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex5forms } from './ex5forms';

describe('Ex5forms', () => {
  let component: Ex5forms;
  let fixture: ComponentFixture<Ex5forms>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex5forms]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex5forms);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
