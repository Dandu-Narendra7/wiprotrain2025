import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex4sub } from './ex4sub';

describe('Ex4sub', () => {
  let component: Ex4sub;
  let fixture: ComponentFixture<Ex4sub>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex4sub]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex4sub);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
