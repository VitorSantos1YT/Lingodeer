package g3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28656a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f28656a == ((k) obj).f28656a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28656a);
    }

    public final String toString() {
        int i11 = this.f28656a;
        if (i11 == 0) {
            return "Button";
        }
        if (i11 == 1) {
            return "Checkbox";
        }
        if (i11 == 2) {
            return "Switch";
        }
        if (i11 == 3) {
            return "RadioButton";
        }
        if (i11 == 4) {
            return "Tab";
        }
        if (i11 == 5) {
            return "Image";
        }
        if (i11 == 6) {
            return "DropdownList";
        }
        if (i11 == 7) {
            return "Picker";
        }
        return i11 == 8 ? "Carousel" : "Unknown";
    }
}
