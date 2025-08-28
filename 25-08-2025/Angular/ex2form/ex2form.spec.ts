import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2form } from './ex2form';

describe('Ex2form', () => {
  let component: Ex2form;
  let fixture: ComponentFixture<Ex2form>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2form]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2form);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
