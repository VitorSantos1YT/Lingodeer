package lm;

import androidx.fragment.app.k0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import km.d2;
import km.m2;
import km.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends FragmentStateAdapter {
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final k0 createFragment(int i11) {
        if (i11 == 0) {
            return new d2();
        }
        if (i11 == 1) {
            return new o2();
        }
        if (i11 == 2) {
            return new m2();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        return 3;
    }
}
