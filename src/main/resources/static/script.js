const API_URL = 'http://localhost:8080/products';

window.onload = loadProducts;

async function loadProducts() {

    const response = await fetch(API_URL);
    const products = await response.json();

    const table = document.getElementById('productTable');
    table.innerHTML = '';

    products.forEach(product => {

        table.innerHTML += `
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>R$ ${product.price}</td>
                <td>
                    <button class="btn btn-warning btn-sm"
                            onclick="editProduct(${product.id}, '${product.name}', ${product.price})">
                        Editar
                    </button>

                    <button class="btn btn-danger btn-sm"
                            onclick="deleteProduct(${product.id})">
                        Excluir
                    </button>
                </td>
            </tr>
        `;
    });
}

async function saveProduct() {

    const id = document.getElementById('productId').value;

    const product = {
        name: document.getElementById('name').value,
        price: parseFloat(document.getElementById('price').value)
    };

    if (id) {
        await fetch(`${API_URL}/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(product)
        });
    } else {
        await fetch(API_URL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(product)
        });
    }

    clearForm();
    loadProducts();
}

function editProduct(id, name, price) {

    document.getElementById('productId').value = id;
    document.getElementById('name').value = name;
    document.getElementById('price').value = price;

    document.getElementById('formTitle').innerText = 'Editar Produto';
    document.getElementById('saveButton').innerText = 'Atualizar';
}

async function deleteProduct(id) {

    const modal = new bootstrap.Modal(document.getElementById('deleteModal'));

    document.getElementById('confirmDeleteButton').onclick = async function () {

        await fetch(`${API_URL}/${id}`, {
            method: 'DELETE'
        });

        modal.hide();
        loadProducts();
    };

    modal.show();
}

function clearForm() {

    document.getElementById('productId').value = '';
    document.getElementById('name').value = '';
    document.getElementById('price').value = '';

    document.getElementById('formTitle').innerText = 'Adicionar Produto';
    document.getElementById('saveButton').innerText = 'Salvar';
}