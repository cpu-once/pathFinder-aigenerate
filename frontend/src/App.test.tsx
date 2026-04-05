import { describe, it, expect } from 'vitest';
import { render, screen } from '@testing-library/react';
import App from './App';

describe('App Component', () => {
  it('renders the Dashboard by default', () => {
    render(<App />);
    const dashboardElements = screen.getAllByText(/Dashboard/i);
    expect(dashboardElements.length).toBeGreaterThan(0);
    expect(dashboardElements[0]).toBeInTheDocument();
  });
});
