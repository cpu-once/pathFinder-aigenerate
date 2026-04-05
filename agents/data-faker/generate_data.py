import csv
from faker import Faker
import uuid
import random
import os

fake = Faker()

def generate_users(num=10):
    users = []
    for _ in range(num):
        users.append({
            "id": str(uuid.uuid4()),
            "name": fake.name(),
            "email": fake.email(),
            "role": random.choice(["ADMIN", "ENGINEER", "MANAGER", "WORKER"])
        })
    return users

def generate_projects(num=5):
    projects = []
    for _ in range(num):
        projects.append({
            "id": str(uuid.uuid4()),
            "name": fake.company() + " Project",
            "description": fake.bs()
        })
    return projects

def save_to_csv(data, filename):
    if not data:
        return
    keys = data[0].keys()
    filepath = os.path.join(os.path.dirname(__file__), filename)
    with open(filepath, 'w', newline='', encoding='utf-8') as output_file:
        dict_writer = csv.DictWriter(output_file, fieldnames=keys)
        dict_writer.writeheader()
        dict_writer.writerows(data)

if __name__ == "__main__":
    print("Generating fake data using Python Faker...")
    users = generate_users(20)
    projects = generate_projects(5)
    
    save_to_csv(users, 'users.csv')
    save_to_csv(projects, 'projects.csv')
    print("Fake data generated and saved to users.csv and projects.csv.")
