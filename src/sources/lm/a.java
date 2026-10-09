package lm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import bq.z;
import com.lingodeer.R;
import dt.j4;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ua.a {
    @Override // ua.a
    public final void a(ViewPager viewPager, int i11, Object object) {
        m.f(object, "object");
        viewPager.removeView((View) object);
    }

    @Override // ua.a
    public final int c() {
        return 5;
    }

    @Override // ua.a
    public final Object d(ViewPager viewPager, int i11) {
        View viewInflate = LayoutInflater.from(viewPager.getContext()).inflate(R.layout.item_jp_syllable_intro_adapter, (ViewGroup) viewPager, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        CardView cardView = (CardView) viewInflate.findViewById(R.id.card_item);
        textView.setText("Part " + (i11 + 1));
        m.c(cardView);
        z.b(cardView, new j4(viewPager, i11, 2));
        viewPager.addView(viewInflate);
        return viewInflate;
    }

    @Override // ua.a
    public final boolean e(View view, Object object) {
        m.f(view, "view");
        m.f(object, "object");
        return view.equals(object);
    }
}
