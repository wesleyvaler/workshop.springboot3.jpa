<<<<<<< HEAD
package com.educandoweb.course.entities.pk.copy;

import java.io.Serializable;
import java.util.Objects;
=======
package com.educandoweb.course.entities.pk;

import java.io.Serializable;
>>>>>>> c3a29ee (feat: bug fixes)

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {
<<<<<<< HEAD
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
    @ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
=======
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

>>>>>>> c3a29ee (feat: bug fixes)
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
<<<<<<< HEAD
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
=======

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

>>>>>>> c3a29ee (feat: bug fixes)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
<<<<<<< HEAD
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
	
	
	
	
}
=======
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
}
>>>>>>> c3a29ee (feat: bug fixes)
