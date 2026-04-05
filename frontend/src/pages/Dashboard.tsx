import React from 'react';

const Dashboard = () => {
  return (
    <div className="space-y-6">
      <h2 className="text-2xl font-bold text-gray-800">Dashboard</h2>
      <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
        {/* Metric Cards */}
        {['Total Projects', 'Active Issues', 'Resolved This Week'].map((title, i) => (
          <div key={i} className="bg-white p-6 rounded-lg shadow-sm border border-gray-100">
            <h3 className="text-gray-500 text-sm font-medium">{title}</h3>
            <p className="mt-2 text-3xl font-semibold text-gray-900">{Math.floor(Math.random() * 50) + 10}</p>
          </div>
        ))}
      </div>
      {/* Chart Placeholder */}
      <div className="bg-white p-6 rounded-lg shadow-sm border border-gray-100 h-64 flex items-center justify-center text-gray-400">
        Recharts Graph Placeholder
      </div>
    </div>
  );
};

export default Dashboard;
