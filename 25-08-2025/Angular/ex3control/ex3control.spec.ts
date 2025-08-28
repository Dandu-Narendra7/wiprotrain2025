import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex3control } from './ex3control';

describe('Ex3control', () => {
  let component: Ex3control;
  let fixture: ComponentFixture<Ex3control>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex3control]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex3control);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
