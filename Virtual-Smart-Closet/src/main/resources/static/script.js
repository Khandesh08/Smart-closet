// Static list of clothes
const clothes = [
    { name: "T-shirt", type: "Casual", color: "Blue" },
    { name: "Jeans", type: "Casual", color: "Black" },
    { name: "Jacket", type: "Formal", color: "Grey" },
    { name: "Sweater", type: "Casual", color: "Red" }
];

// Static list of outfits
const outfits = [
    { outfitName: "Casual Outfit 1" },
    { outfitName: "Formal Outfit 2" },
    { outfitName: "Weekend Outfit" },
    { outfitName: "Winter Outfit" }
];

// Function to load clothes
function fetchClothes() {
    const clothesList = document.getElementById('clothesList');
    clothesList.innerHTML = ''; // Clear the list before appending new items

    clothes.forEach(cloth => {
        const item = document.createElement('div');
        item.textContent = `${cloth.name} - ${cloth.type} - ${cloth.color}`;
        clothesList.appendChild(item);
    });
}

// Function to load outfits
function fetchOutfits() {
    const outfitsList = document.getElementById('outfitsList');
    outfitsList.innerHTML = ''; // Clear the list before appending new items

    outfits.forEach(outfit => {
        const item = document.createElement('div');
        item.textContent = outfit.outfitName;
        outfitsList.appendChild(item);
    });
}

// Attach event listeners to buttons
document.getElementById('loadClothesButton').addEventListener('click', fetchClothes);
document.getElementById('loadOutfitsButton').addEventListener('click', fetchOutfits);
