package com.quickkart.productservice.config;

import com.quickkart.productservice.model.Product;
import com.quickkart.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DataSeeder {

    @SuppressWarnings("null")
    @Bean
    CommandLineRunner seedProducts(ProductRepository repo) {
        return args -> {
            if (repo.count() > 0) return; // Don't re-seed if data already exists

            repo.saveAll(List.of(
                Product.builder()
                    .name("Wireless Noise-Cancelling Headphones")
                    .description("Premium over-ear headphones with 30hr battery life and active noise cancellation.")
                    .price(new BigDecimal("4999.00"))
                    .category("Electronics")
                    .imageUrl("https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=400")
                    .stock(50)
                    .build(),

                Product.builder()
                    .name("Mechanical Gaming Keyboard")
                    .description("RGB backlit mechanical keyboard with tactile switches, perfect for gaming and typing.")
                    .price(new BigDecimal("3499.00"))
                    .category("Electronics")
                    .imageUrl("https://images.unsplash.com/photo-1587829741301-dc798b83add3?w=400")
                    .stock(35)
                    .build(),

                Product.builder()
                    .name("Slim Fit Cotton T-Shirt")
                    .description("100% organic cotton slim fit t-shirt, breathable and comfortable for everyday wear.")
                    .price(new BigDecimal("599.00"))
                    .category("Clothing")
                    .imageUrl("https://images.unsplash.com/photo-1521572163474-6864f9cf17ab?w=400")
                    .stock(200)
                    .build(),

                Product.builder()
                    .name("Running Shoes - Air Cushion")
                    .description("Lightweight running shoes with air cushion sole, ideal for long-distance running.")
                    .price(new BigDecimal("2999.00"))
                    .category("Footwear")
                    .imageUrl("https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=400")
                    .stock(80)
                    .build(),

                Product.builder()
                    .name("Stainless Steel Water Bottle")
                    .description("1L double-walled insulated bottle, keeps drinks cold 24hrs and hot 12hrs.")
                    .price(new BigDecimal("799.00"))
                    .category("Kitchen")
                    .imageUrl("https://images.unsplash.com/photo-1602143407151-7111542de6e8?w=400")
                    .stock(150)
                    .build(),

                Product.builder()
                    .name("Yoga Mat - Anti-Slip")
                    .description("6mm thick eco-friendly TPE yoga mat with carrying strap. Non-toxic and anti-slip.")
                    .price(new BigDecimal("1299.00"))
                    .category("Sports")
                    .imageUrl("https://images.unsplash.com/photo-1601925228008-41cd7c6e5f87?w=400")
                    .stock(60)
                    .build(),

                Product.builder()
                    .name("Ceramic Coffee Mug Set")
                    .description("Set of 4 hand-crafted ceramic mugs, 350ml each, microwave and dishwasher safe.")
                    .price(new BigDecimal("899.00"))
                    .category("Kitchen")
                    .imageUrl("https://images.unsplash.com/photo-1514228742587-6b1558fcca3d?w=400")
                    .stock(90)
                    .build(),

                Product.builder()
                    .name("Portable Bluetooth Speaker")
                    .description("Waterproof IPX7 Bluetooth 5.0 speaker with 360° sound and 12hr playtime.")
                    .price(new BigDecimal("2499.00"))
                    .category("Electronics")
                    .imageUrl("https://images.unsplash.com/photo-1608043152269-423dbba4e7e1?w=400")
                    .stock(45)
                    .build(),

                Product.builder()
                    .name("Leather Crossbody Bag")
                    .description("Genuine leather crossbody bag with multiple compartments, adjustable strap.")
                    .price(new BigDecimal("1899.00"))
                    .category("Accessories")
                    .imageUrl("https://images.unsplash.com/photo-1548036328-c9fa89d128fa?w=400")
                    .stock(40)
                    .build(),

                Product.builder()
                    .name("Smart LED Desk Lamp")
                    .description("Touch-control LED lamp with 5 brightness levels, USB-C charging port, and eye-care mode.")
                    .price(new BigDecimal("1499.00"))
                    .category("Electronics")
                    .imageUrl("https://images.unsplash.com/photo-1507473885765-e6ed057f782c?w=400")
                    .stock(70)
                    .build()
            ));

            System.out.println("✅ Seeded 10 dummy products into product-service.");
        };
    }
}
