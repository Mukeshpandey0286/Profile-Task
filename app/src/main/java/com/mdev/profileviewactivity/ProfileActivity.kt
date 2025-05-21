package com.mdev.profileviewactivity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mdev.profileviewactivity.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Using View Binding
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set status bar color to match app theme
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = resources.getColor(R.color.black, theme)

        setupClickListeners()
        loadUserData()
    }

    private fun setupClickListeners() {
        // Back button click
        binding.btnBack.setOnClickListener {
            finish()
        }

        // Support button click
        binding.btnSupport.setOnClickListener {
            showToast("Support clicked")
        }

        // Edit profile button click
        binding.btnEdit.setOnClickListener {
            showToast("Edit profile clicked")
        }

        // CRED Garage card click
        binding.cardGarage.setOnClickListener {
            showToast("CRED garage clicked")
        }

        // Credit Score click
        binding.tvCreditScore.setOnClickListener {
            showToast("Credit score clicked")
        }

        binding.tvRefreshAvailable.setOnClickListener {
            showToast("Refreshing credit score")
        }

        // Lifetime cashback click
        binding.tvCashbackAmount.setOnClickListener {
            showToast("Lifetime cashback details")
        }

        // Bank balance click
        binding.tvCheckBalance.setOnClickListener {
            showToast("Checking bank balance")
        }

        // Cashback balance click
        binding.tvCashbackBalanceLabel.setOnClickListener {
            showToast("Cashback balance details")
        }

        // Coins click
        binding.tvCoinsLabel.setOnClickListener {
            showToast("Coins details")
        }

        // Refer and earn click
        binding.tvReferLabel.setOnClickListener {
            showToast("Refer and earn")
        }

        // All transactions click
        binding.tvAllTransactionsLabel.setOnClickListener {
            showToast("All transactions")
        }
    }

    private fun loadUserData() {
        // In a real app, this data would come from an API or local database
        // For this implementation, we'll hardcode the values as seen in the screenshot

        // User profile info
        binding.tvName.text = "andaz Kumar"
        binding.tvMemberSince.text = "member since Dec, 2020"

        // Credit score
        binding.tvCreditScore.text = "757"

        // Lifetime cashback
        binding.tvCashbackAmount.text = "₹3"

        // Bank balance - shows "check" in the UI
        binding.tvCheckBalance.text = "check"

        // Cashback balance
        binding.tvCashbackBalanceAmount.text = "₹0"

        // Coins amount
        binding.tvCoinsAmount.text = "26,46,583"

        // Load profile image (in a real app, this would use Glide or similar)
        // For this implementation, we're using a placeholder in the layout XML
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}