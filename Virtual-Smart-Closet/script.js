/**
 * 
 */

// Fetch Clothes Data
function fetchClothes() {
    fetch('http://localhost:8085/clothes')
        .then(response => response.json())
        .then(data => {
            let output = '<h3>Clothes List</h3>';
            data.forEach(item => {
                output += `
                    <p><strong>Type:</strong> ${item.type}, 
                    <strong>Color:</strong> ${item.color}, 
                    <strong>Size:</strong> ${item.size}</p>`;
            });
            document.getElementById('clothesList').innerHTML = output;
        })
        .catch(error => console.error('Error fetching clothes:', error));
}

// Fetch Outfits Data
function fetchOutfits() {
    fetch('http://localhost:8085/outfits')
        .then(response => response.json())
        .then(data => {
            let output = '<h3>Outfits List</h3>';
            data.forEach(outfit => {
                output += `
                    <p><strong>Outfit Name:</strong> ${outfit.outfitName}</p>`;
            });
            document.getElementById('outfitsList').innerHTML = output;
        })
        .catch(error => console.error('Error fetching outfits:', error));
}
