int main() {
    t = kmalloc(sizeof(wl_timer_t), GFP_ATOMIC);
    if(!t) {
        WL_ERROR("wl%d: wl_init_timer: out of memory\n", wl->pub ->unit);
        return 0;
    }

    memset(t, 0, sizeof(wl_timer_t ));
}