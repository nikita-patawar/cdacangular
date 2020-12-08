import { TestBed } from '@angular/core/testing';

import { OwnerdashboardService } from './ownerdashboard.service';

describe('OwnerdashboardService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: OwnerdashboardService = TestBed.get(OwnerdashboardService);
    expect(service).toBeTruthy();
  });
});
