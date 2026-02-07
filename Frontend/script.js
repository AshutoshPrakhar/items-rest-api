const backendUrl = "https://items-rest-api-1.onrender.com/items";

document.getElementById('addBtn').addEventListener('click', async () => {
  const name = document.getElementById('name').value;
  const description = document.getElementById('description').value;

  const response = await fetch(`${backendUrl}/addItem`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ name, description })
  });

  const data = await response.json();
  alert("Item added: " + JSON.stringify(data));
});

document.getElementById('getBtn').addEventListener('click', async () => {
  const id = document.getElementById('id').value;

  const response = await fetch(`${backendUrl}/${id}`);
  const data = await response.json();
  document.getElementById('result').textContent = JSON.stringify(data, null, 2);
});
