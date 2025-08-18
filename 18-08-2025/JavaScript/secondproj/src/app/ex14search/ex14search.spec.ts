import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex14search } from './ex14search';

describe('Ex14search', () => {
  let component: Ex14search;
  let fixture: ComponentFixture<Ex14search>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex14search]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex14search);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
