import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Produclist } from './produclist';

describe('Produclist', () => {
  let component: Produclist;
  let fixture: ComponentFixture<Produclist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Produclist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Produclist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
