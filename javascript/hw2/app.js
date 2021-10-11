const foods = [
  {
    id: 1,
    title: "Turkish Kebab",
    category: "Turkish",
    price: 29.99,
    img:
      "http://www.cizzzgara.com/trex/assets/img/hizmetler/2570031411.jpg",
    desc: `Barbecued scrambled meat at its best.`,
  },
  {
    id: 2,
    title: "Chicken Ramen",
    category: "Japan",
    price: 7.99,
    img:
      "https://www.forkknifeswoon.com/wp-content/uploads/2014/10/simple-homemade-chicken-ramen-fork-knife-swoon-01.jpg",
    desc: `Chicken noodle soup, serving with vegetables such as soy bean, green onion. In an optional you can ask for egg. `,
  },
  {
    id: 3,
    title: "Bibimbap",
    category: "Korea",
    price: 8.99,
    img:
      "https://dwellbymichelle.com/wp-content/uploads/2020/05/DWELL-bibimbap.jpg",
    desc: `Boiling vegetables, serving with special hot sauce`,
  },
  {
    id: 4,
    title: "Dan Dan Mian",
    category: "China",
    price: 5.99,
    img:
      "https://www.savingdessert.com/wp-content/uploads/2019/02/Dan-Dan-Noodles-10.jpg",
    desc: `Dan dan noodle, serving with green onion `,
  },
  {
    id: 5,
    title: "Cassoulet",
    category: "French",
    price: 12.99,
    img:
      "https://www.expatica.com/app/uploads/sites/5/2014/05/cassoulet.jpg",
    desc: `Cassoulet is a comfort dish of white beans stewed slowly with meat.`,
  },
  {
    id: 6,
    title: "Onigiri",
    category: "Japan",
    price: 9.99,
    img:
      "https://www.manusmenu.com/wp-content/uploads/2017/08/Onigiri-3-1-of-1.jpg",
    desc: `Rice Sandwich, serving with soy sauce`,
  },
  {
    id: 7,
    title: "Jajangmyeon",
    category: "Korea",
    price: 15.99,
    img:
      "https://www.curiouscuisiniere.com/wp-content/uploads/2020/04/Jajangmyeon-Korean-Noodles-in-Black-Bean-Sauce5.1200H-720x540.jpg",
    desc: `Black bean sauce noodle, serving with green onion `,
  },
  {
    id: 8,
    title: "Ma Yi Shang Shu",
    category: "China",
    price: 12.99,
    img:
      "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/F688C2F6-86EC-46C4-B9C7-A6BA01DF7437/Derivates/32E3E72A-F786-406D-AF7F-B30980A9AC6C.jpg",
    desc: `Hot pepper sauce noodle, serving with soy bean and onion`,
  },
  {
    id: 9,
    title: "Lahmacun",
    category: "Turkish",
    price: 15.99,
    img:
      "https://cdn.yemek.com/mnresize/940/940/uploads/2020/05/ev-yapimi-lahmacun-yemekcom.jpg",
    desc: `Combination of vegetables and meat in the oven on thin dough`,
  },
  {
    id: 10,
    title: "Manti",
    category: "Turkish",
    price: 9.99,
    img:
      "https://dishesfromturkey.com/wp-content/uploads/2020/12/More-Delicious-Turkish-Foods-to-Love-780x470.jpg",
    desc: `The unique meeting of meat, dough, butter and yoghurt.`,
  },
  {
    id: 11,
    title: "Yaprak Sarma",
    category: "Turkish",
    price: 7.99,
    img:
      "http://cdn.cnn.com/cnnnext/dam/assets/200401171739-06-best-turkish-foods-yaprak-dolma.jpg",
    desc: `Wrapping with delicious olive oil from tree leaves.`,
  },
  {
    id: 12,
    title: "Pasta",
    category: "Italian",
    price: 13.99,
    img:
      "https://www.thesun.co.uk/wp-content/uploads/2020/08/NINTCHDBPICT000603046726.jpg",
    desc: `Enjoying garlic bread with pasta, covering the dish with cheese and putting oil..`,
  },
  {
    id: 13,
    title: "Chocolate Soufflé",
    category: "French",
    price: 23.99,
    img:
      "https://www.expatica.com/app/uploads/sites/5/2020/03/Chocolate-souffle%CC%81%EF%BB%BF-1024x683.jpg",
    desc: `A light, airy dessert.`,
  },
  {
    id: 14,
    title: "Confit de canard",
    category: "French",
    price: 7.99,
    img:
      "https://www.expatica.com/app/uploads/sites/5/2020/03/Confit-de-canard-1024x683.jpg",
    desc: `he meat is specially prepared using ancient preservation and slow-cooking process (confit).`,
  },
];
const section = document.querySelector(".section-center");
const btnContainer = document.querySelector(".btn-container");

const categories = foods.reduce(
  
  (values, item) => {
    if (!values.includes(item.category)) {
      values.push(item.category);
    }
    return values;
  },
  ["All"]
);

const categoryList = () => {
  const categoryButtons = categories
    .map((category) => {
      return `<button class="btn btn-outline-dark btn-item" data-id=${category}>${category}</button>`;
    })
    .join(""); // kategoler arasındaki virgülleri kaldırmak için join() metodu kullanıldı

  btnContainer.innerHTML = categoryButtons;
  const filterButtons = document.querySelectorAll(".btn-item");

  filterButtons.forEach((btn) => {
    btn.addEventListener("click", (e) => {
      const category = e.currentTarget.dataset.id;
      console.log(category);
      const menuCategory = foods.filter((foodsItems) => {
        if (foodsItems.category === category) {
          return foodsItems;
        }
      });
      if (category === "All") {
        foodsList(foods);
      } else {
        foodsList(menuCategory);
      }
    });
  });
};

const foodsList = (foodsItems) => {
  let showFoods = foodsItems.map((item) => {
    return `<div class="menu-items col-lg-6 col-sm-12">
            <img
              src=${item.img}
              alt=${item.title}
              class="photo"
            />
            <div class="menu-info">
              <div class="menu-title">
                <h4>${item.title}</h4>
                <h4 class="price">${item.price}</h4>
              </div>
              <div class="foods-text">
                ${item.desc}
              </div>
            </div>
          </div>
    `;
  });
  showFoods = showFoods.join(""); // kategoler arasındaki virgülleri kaldırmak için join() metodu kullanıldı
  section.innerHTML = showFoods;
};
categoryList();
foodsList(foods);