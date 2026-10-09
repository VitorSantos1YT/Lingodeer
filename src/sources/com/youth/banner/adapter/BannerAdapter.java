package com.youth.banner.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import com.youth.banner.R;
import com.youth.banner.holder.IViewHolder;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.util.BannerUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BannerAdapter<T, VH extends g2> extends b1 implements IViewHolder<T, VH> {
    protected List<T> mDatas = new ArrayList();
    private int mIncreaseCount = 2;
    private OnBannerListener<T> mOnBannerListener;
    private VH mViewHolder;

    public BannerAdapter(List<T> list) {
        setDatas(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(Object obj, int i11, View view) {
        this.mOnBannerListener.OnBannerClick(obj, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ void lambda$onCreateViewHolder$1(g2 g2Var, View view) {
        if (this.mOnBannerListener != null) {
            Object tag = g2Var.itemView.getTag(R.id.banner_data_key);
            this.mOnBannerListener.OnBannerClick((T) tag, ((Integer) g2Var.itemView.getTag(R.id.banner_pos_key)).intValue());
        }
    }

    public T getData(int i11) {
        if (i11 > this.mDatas.size() - 1) {
            return null;
        }
        return this.mDatas.get(i11);
    }

    @Override // androidx.recyclerview.widget.b1
    public int getItemCount() {
        return getRealCount() > 1 ? getRealCount() + this.mIncreaseCount : getRealCount();
    }

    public int getRealCount() {
        List<T> list = this.mDatas;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T getRealData(int i11) {
        int realPosition = getRealPosition(i11);
        if (realPosition > this.mDatas.size() - 1) {
            return null;
        }
        return this.mDatas.get(realPosition);
    }

    public int getRealPosition(int i11) {
        return BannerUtils.getRealPosition(this.mIncreaseCount == 2, i11, getRealCount());
    }

    public VH getViewHolder() {
        return this.mViewHolder;
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(VH vh2, int i11) {
        this.mViewHolder = vh2;
        final int realPosition = getRealPosition(i11);
        final T t6 = this.mDatas.get(realPosition);
        vh2.itemView.setTag(R.id.banner_data_key, t6);
        vh2.itemView.setTag(R.id.banner_pos_key, Integer.valueOf(realPosition));
        onBindView(vh2, this.mDatas.get(realPosition), realPosition, getRealCount());
        if (this.mOnBannerListener != null) {
            vh2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.youth.banner.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22417a.lambda$onBindViewHolder$0(t6, realPosition, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public VH onCreateViewHolder(ViewGroup viewGroup, int i11) {
        VH vhOnCreateHolder = onCreateHolder(viewGroup, i11);
        vhOnCreateHolder.itemView.setOnClickListener(new com.google.android.material.snackbar.a(1, this, vhOnCreateHolder));
        return vhOnCreateHolder;
    }

    public void setDatas(List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mDatas.clear();
        this.mDatas.addAll(list);
        notifyDataSetChanged();
    }

    public void setIncreaseCount(int i11) {
        this.mIncreaseCount = i11;
    }

    public void setOnBannerListener(OnBannerListener<T> onBannerListener) {
        this.mOnBannerListener = onBannerListener;
    }
}
