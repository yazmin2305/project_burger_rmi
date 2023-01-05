# project_burger_rmi
Se implementó un programa mediante el modelo de invocación a métodos remotos y servidores
concurrentes, el cual permite a los clientes comprar hamburguesas pequeñas, medianas y grandes, y asignarle
una cantidad de ingredientes extra. El cliente debe enviar un objeto DTO al servidor de pedidos, el cual genera
una factura con el costo parcial de la hamburguesa y costo total del pedido. La factura generada es
enviada a un servidor concurrente de facturas el cual está implementado con sockecs. Cuando llega una
factura se notifica automáticamente a un conjunto de cocineros, los cuales previamente se deben
registrar.
