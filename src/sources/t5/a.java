package t5;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z11 = false;
        boolean z12 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f1592c0 = windowInsets;
        drawerLayout.f1594d0 = z12;
        if (!z12 && drawerLayout.getBackground() == null) {
            z11 = true;
        }
        drawerLayout.setWillNotDraw(z11);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
