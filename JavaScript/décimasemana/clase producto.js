// DELGADO CAROLINA
class Producto{
    static contadorProductos = 0;

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }
    
    set precio(precio){
        this._precio = precio;
    }

    toString(){ //Template Literals: nos permite insertar código dinamicamente
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}  `;
    }
}

//SABA JUAN AGUSTÍN
class Orden{
    static contadorOrdenes=0;
    static getMAX_PRODUCTOS(){ //simula una constante
        return 5;
    }
    constructor(){
        this._idOrden= ++Orden.contadorOrdenes;
        this._productos=[];
        this._contadorProductosAgregados=0;
    }
    get idOrden(){
        return this._idOrden;
    }
// TORRES DAVID
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);//tenemos 2 tipos de sintaxis: 1
             //this._productos[this._contadorProductosAgregados++]=producto; // segunda sintaxis
        }
        else{
            console.log(" No se puede agregar mas productos")
        }
    }//fin del metodo agregarProducto

///////////////////////////////////////////////////////////TORRES MIRIAM

///////////////////////////////////////////////////////////GIANGRAVE FACUNDO
