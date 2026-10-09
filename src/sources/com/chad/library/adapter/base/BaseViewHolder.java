package com.chad.library.adapter.base;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.g2;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class BaseViewHolder extends g2 {
    private BaseQuickAdapter adapter;
    private Object associatedObject;
    private final LinkedHashSet<Integer> childClickViewIds;

    @Deprecated
    public View convertView;
    private final LinkedHashSet<Integer> itemChildLongClickViewIds;
    private final HashSet<Integer> nestViews;
    private final SparseArray<View> views;

    public BaseViewHolder(View view) {
        super(view);
        this.views = new SparseArray<>();
        this.childClickViewIds = new LinkedHashSet<>();
        this.itemChildLongClickViewIds = new LinkedHashSet<>();
        this.nestViews = new HashSet<>();
        this.convertView = view;
    }

    public BaseViewHolder addOnClickListener(int... iArr) {
        for (int i11 : iArr) {
            this.childClickViewIds.add(Integer.valueOf(i11));
            View view = getView(i11);
            if (view != null) {
                if (!view.isClickable()) {
                    view.setClickable(true);
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        int adapterPosition;
                        if (BaseViewHolder.this.adapter.getOnItemChildClickListener() == null || (adapterPosition = BaseViewHolder.this.getAdapterPosition()) == -1) {
                            return;
                        }
                        BaseViewHolder.this.adapter.getOnItemChildClickListener().onItemChildClick(BaseViewHolder.this.adapter, view2, adapterPosition - BaseViewHolder.this.adapter.getHeaderLayoutCount());
                    }
                });
            }
        }
        return this;
    }

    public BaseViewHolder addOnLongClickListener(int... iArr) {
        for (int i11 : iArr) {
            this.itemChildLongClickViewIds.add(Integer.valueOf(i11));
            View view = getView(i11);
            if (view != null) {
                if (!view.isLongClickable()) {
                    view.setLongClickable(true);
                }
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseViewHolder.2
                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view2) {
                        int adapterPosition;
                        if (BaseViewHolder.this.adapter.getOnItemChildLongClickListener() == null || (adapterPosition = BaseViewHolder.this.getAdapterPosition()) == -1) {
                            return false;
                        }
                        return BaseViewHolder.this.adapter.getOnItemChildLongClickListener().onItemChildLongClick(BaseViewHolder.this.adapter, view2, adapterPosition - BaseViewHolder.this.adapter.getHeaderLayoutCount());
                    }
                });
            }
        }
        return this;
    }

    public Object getAssociatedObject() {
        return this.associatedObject;
    }

    public HashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @Deprecated
    public View getConvertView() {
        return this.convertView;
    }

    public HashSet<Integer> getItemChildLongClickViewIds() {
        return this.itemChildLongClickViewIds;
    }

    public Set<Integer> getNestViews() {
        return this.nestViews;
    }

    public <T extends View> T getView(int i11) {
        T t6 = (T) this.views.get(i11);
        if (t6 != null) {
            return t6;
        }
        T t8 = (T) this.itemView.findViewById(i11);
        this.views.put(i11, t8);
        return t8;
    }

    public BaseViewHolder linkify(int i11) {
        Linkify.addLinks((TextView) getView(i11), 15);
        return this;
    }

    public BaseViewHolder setAdapter(int i11, Adapter adapter) {
        ((AdapterView) getView(i11)).setAdapter(adapter);
        return this;
    }

    public BaseViewHolder setAlpha(int i11, float f5) {
        getView(i11).setAlpha(f5);
        return this;
    }

    public void setAssociatedObject(Object obj) {
        this.associatedObject = obj;
    }

    public BaseViewHolder setBackgroundColor(int i11, int i12) {
        getView(i11).setBackgroundColor(i12);
        return this;
    }

    public BaseViewHolder setBackgroundRes(int i11, int i12) {
        getView(i11).setBackgroundResource(i12);
        return this;
    }

    public BaseViewHolder setChecked(int i11, boolean z11) {
        KeyEvent.Callback view = getView(i11);
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(z11);
        }
        return this;
    }

    public BaseViewHolder setEnabled(int i11, boolean z11) {
        getView(i11).setEnabled(z11);
        return this;
    }

    public BaseViewHolder setGone(int i11, boolean z11) {
        getView(i11).setVisibility(z11 ? 0 : 8);
        return this;
    }

    public BaseViewHolder setImageBitmap(int i11, Bitmap bitmap) {
        ((ImageView) getView(i11)).setImageBitmap(bitmap);
        return this;
    }

    public BaseViewHolder setImageDrawable(int i11, Drawable drawable) {
        ((ImageView) getView(i11)).setImageDrawable(drawable);
        return this;
    }

    public BaseViewHolder setImageResource(int i11, int i12) {
        ((ImageView) getView(i11)).setImageResource(i12);
        return this;
    }

    public BaseViewHolder setMax(int i11, int i12) {
        ((ProgressBar) getView(i11)).setMax(i12);
        return this;
    }

    public BaseViewHolder setNestView(int... iArr) {
        for (int i11 : iArr) {
            this.nestViews.add(Integer.valueOf(i11));
        }
        addOnClickListener(iArr);
        addOnLongClickListener(iArr);
        return this;
    }

    public BaseViewHolder setOnCheckedChangeListener(int i11, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        ((CompoundButton) getView(i11)).setOnCheckedChangeListener(onCheckedChangeListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnClickListener(int i11, View.OnClickListener onClickListener) {
        getView(i11).setOnClickListener(onClickListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnItemClickListener(int i11, AdapterView.OnItemClickListener onItemClickListener) {
        ((AdapterView) getView(i11)).setOnItemClickListener(onItemClickListener);
        return this;
    }

    public BaseViewHolder setOnItemLongClickListener(int i11, AdapterView.OnItemLongClickListener onItemLongClickListener) {
        ((AdapterView) getView(i11)).setOnItemLongClickListener(onItemLongClickListener);
        return this;
    }

    public BaseViewHolder setOnItemSelectedClickListener(int i11, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        ((AdapterView) getView(i11)).setOnItemSelectedListener(onItemSelectedListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnLongClickListener(int i11, View.OnLongClickListener onLongClickListener) {
        getView(i11).setOnLongClickListener(onLongClickListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnTouchListener(int i11, View.OnTouchListener onTouchListener) {
        getView(i11).setOnTouchListener(onTouchListener);
        return this;
    }

    public BaseViewHolder setProgress(int i11, int i12) {
        ((ProgressBar) getView(i11)).setProgress(i12);
        return this;
    }

    public BaseViewHolder setRating(int i11, float f5) {
        ((RatingBar) getView(i11)).setRating(f5);
        return this;
    }

    public BaseViewHolder setTag(int i11, Object obj) {
        getView(i11).setTag(obj);
        return this;
    }

    public BaseViewHolder setText(int i11, CharSequence charSequence) {
        ((TextView) getView(i11)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTextColor(int i11, int i12) {
        ((TextView) getView(i11)).setTextColor(i12);
        return this;
    }

    public BaseViewHolder setTypeface(int i11, Typeface typeface) {
        TextView textView = (TextView) getView(i11);
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        return this;
    }

    public BaseViewHolder setVisible(int i11, boolean z11) {
        getView(i11).setVisibility(z11 ? 0 : 4);
        return this;
    }

    public BaseViewHolder setAdapter(BaseQuickAdapter baseQuickAdapter) {
        this.adapter = baseQuickAdapter;
        return this;
    }

    public BaseViewHolder setProgress(int i11, int i12, int i13) {
        ProgressBar progressBar = (ProgressBar) getView(i11);
        progressBar.setMax(i13);
        progressBar.setProgress(i12);
        return this;
    }

    public BaseViewHolder setRating(int i11, float f5, int i12) {
        RatingBar ratingBar = (RatingBar) getView(i11);
        ratingBar.setMax(i12);
        ratingBar.setRating(f5);
        return this;
    }

    public BaseViewHolder setTag(int i11, int i12, Object obj) {
        getView(i11).setTag(i12, obj);
        return this;
    }

    public BaseViewHolder setText(int i11, int i12) {
        ((TextView) getView(i11)).setText(i12);
        return this;
    }

    public BaseViewHolder setTypeface(Typeface typeface, int... iArr) {
        for (int i11 : iArr) {
            TextView textView = (TextView) getView(i11);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | 128);
        }
        return this;
    }
}
