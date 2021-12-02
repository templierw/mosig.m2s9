typedef struct ide_hwif {
    int hwif_data;
} ide_hwif_t;

int main() {
    ide_hwif_t* dev;
    dev->hwif_data = 5;

    if (dev->hwif_data == 5) {
        int a = 1;
    }

    return dev->hwif_data + 10;
}




