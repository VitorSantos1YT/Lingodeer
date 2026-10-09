package bq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.object.BillingBannerItem;
import com.lingodeer.R;
import com.youth.banner.adapter.BannerAdapter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends BannerAdapter {
    @Override // com.youth.banner.holder.IViewHolder
    public final void onBindView(Object obj, Object obj2, int i11, int i12) {
        View view;
        j jVar = (j) obj;
        BillingBannerItem data = (BillingBannerItem) obj2;
        kotlin.jvm.internal.m.f(data, "data");
        if (jVar == null || (view = jVar.itemView) == null) {
            return;
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.lav_deer);
        lottieAnimationView.setAnimation(data.getLottieRaw());
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.h();
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_desc);
        textView.setText(data.getTitle());
        textView2.setText(data.getDesc());
    }

    @Override // com.youth.banner.holder.IViewHolder
    public final Object onCreateHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.m.f(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dialog_purchase_vp, parent, false);
        kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new j((ViewGroup) viewInflate);
    }
}
