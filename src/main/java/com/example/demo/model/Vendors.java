package com.example.demo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendors")
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendor_id")
    private Integer vendorId;

    @Column(name = "vendor_name", nullable = false, length = 100)
    private String vendorName;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "contact_person_name", length = 100)
    private String contactPersonName;

    @Column(name = "contact_email", length = 100)
    private String contactEmail;

    @Column(name = "contact_phone", length = 20)
    private String contactPhone;

    @Column(name = "website_url", length = 255)
    private String websiteUrl;

    @Column(name = "total_gold_quantity", nullable = false, precision = 18, scale = 2)
    private BigDecimal totalGoldQuantity = BigDecimal.ZERO;

    @Column(name = "current_gold_price", nullable = false, precision = 18, scale = 2)
    private BigDecimal currentGoldPrice = new BigDecimal("5700.00");

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    public Integer getVendorId() { return vendorId; }
    public void setVendorId(Integer vendorId) { this.vendorId = vendorId; }

    public String getVendorName() { return vendorName; }
    public void setVendorName(String vendorName) { this.vendorName = vendorName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getContactPersonName() { return contactPersonName; }
    public void setContactPersonName(String contactPersonName) { this.contactPersonName = contactPersonName; }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }

    public String getContactPhone() { return contactPhone; }
    public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; }

    public String getWebsiteUrl() { return websiteUrl; }
    public void setWebsiteUrl(String websiteUrl) { this.websiteUrl = websiteUrl; }

    public BigDecimal getTotalGoldQuantity() { return totalGoldQuantity; }
    public void setTotalGoldQuantity(BigDecimal totalGoldQuantity) { this.totalGoldQuantity = totalGoldQuantity; }

    public BigDecimal getCurrentGoldPrice() { return currentGoldPrice; }
    public void setCurrentGoldPrice(BigDecimal currentGoldPrice) { this.currentGoldPrice = currentGoldPrice; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}