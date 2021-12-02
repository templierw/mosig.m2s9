typedef struct ide_hwif {
    int hwif_data;
} ide_hwif_t;

int main() {
    ide_hwif_t* dev;
    ide_set_hwifdata(dev, 5);

    if (ide_get_hwifdata(dev) == 5) {
        int a = 1;
    }

    return ide_get_hwifdata(dev) + 10;
}




