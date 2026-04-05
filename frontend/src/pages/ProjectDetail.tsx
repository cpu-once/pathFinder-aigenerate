import React from 'react';
import { useParams } from 'react-router-dom';

const ProjectDetail = () => {
  const { projectId } = useParams();

  return (
    <div className="space-y-6">
      <div className="flex justify-between items-center">
        <div>
          <h2 className="text-2xl font-bold text-gray-800">Project: {projectId}</h2>
          <p className="text-gray-500 mt-1">Overview and recent activities.</p>
        </div>
        <button className="bg-blue-600 text-white px-4 py-2 rounded-md hover:bg-blue-700">
          New Issue
        </button>
      </div>

      <div className="bg-white rounded-lg shadow-sm border border-gray-100 p-6">
        <h3 className="text-lg font-medium mb-4">Briefs & Chronicles</h3>
        <ul className="space-y-3">
          {[1, 2, 3].map((i) => (
            <li key={i} className="p-4 bg-gray-50 rounded-md border border-gray-200">
              <span className="text-xs font-semibold text-blue-600 bg-blue-100 px-2 py-1 rounded-full">Brief #{i}</span>
              <p className="mt-2 text-gray-700">Project foundation updated with new requirements from stakeholders.</p>
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default ProjectDetail;
