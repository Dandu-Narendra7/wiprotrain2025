import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Listmodel } from './listmodel';

describe('Listmodel', () => {
  let component: Listmodel;
  let fixture: ComponentFixture<Listmodel>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Listmodel]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Listmodel);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
