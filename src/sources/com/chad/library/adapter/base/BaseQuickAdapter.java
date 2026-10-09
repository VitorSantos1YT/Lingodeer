package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.m2;
import androidx.recyclerview.widget.n1;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.p2;
import androidx.recyclerview.widget.u;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.chad.library.adapter.base.animation.SlideInBottomAnimation;
import com.chad.library.adapter.base.animation.SlideInLeftAnimation;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.chad.library.adapter.base.diff.BaseQuickAdapterListUpdateCallback;
import com.chad.library.adapter.base.diff.BaseQuickDiffCallback;
import com.chad.library.adapter.base.entity.IExpandable;
import com.chad.library.adapter.base.loadmore.LoadMoreView;
import com.chad.library.adapter.base.loadmore.SimpleLoadMoreView;
import com.google.logging.type.LogSeverity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseQuickAdapter<T, K extends BaseViewHolder> extends b1 {
    public static final int ALPHAIN = 1;
    public static final int EMPTY_VIEW = 1365;
    public static final int FOOTER_VIEW = 819;
    public static final int HEADER_VIEW = 273;
    public static final int LOADING_VIEW = 546;
    public static final int SCALEIN = 2;
    public static final int SLIDEIN_BOTTOM = 3;
    public static final int SLIDEIN_LEFT = 4;
    public static final int SLIDEIN_RIGHT = 5;
    protected static final String TAG = "BaseQuickAdapter";
    private boolean footerViewAsFlow;
    private boolean headerViewAsFlow;
    protected Context mContext;
    private BaseAnimation mCustomAnimation;
    protected List<T> mData;
    private int mDuration;
    private FrameLayout mEmptyLayout;
    private boolean mEnableLoadMoreEndClick;
    private boolean mFirstOnlyEnable;
    private boolean mFootAndEmptyEnable;
    private LinearLayout mFooterLayout;
    private boolean mHeadAndEmptyEnable;
    private LinearLayout mHeaderLayout;
    private Interpolator mInterpolator;
    private boolean mIsUseEmpty;
    private int mLastPosition;
    protected LayoutInflater mLayoutInflater;
    protected int mLayoutResId;
    private boolean mLoadMoreEnable;
    private LoadMoreView mLoadMoreView;
    private boolean mLoading;
    private boolean mNextLoadEnable;
    private OnItemChildClickListener mOnItemChildClickListener;
    private OnItemChildLongClickListener mOnItemChildLongClickListener;
    private OnItemClickListener mOnItemClickListener;
    private OnItemLongClickListener mOnItemLongClickListener;
    private boolean mOpenAnimationEnable;
    private int mPreLoadNumber;
    private RecyclerView mRecyclerView;
    private RequestLoadMoreListener mRequestLoadMoreListener;
    private BaseAnimation mSelectAnimation;
    private SpanSizeLookup mSpanSizeLookup;
    private int mStartUpFetchPosition;
    private boolean mUpFetchEnable;
    private UpFetchListener mUpFetchListener;
    private boolean mUpFetching;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationType {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnItemChildClickListener {
        void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnItemChildLongClickListener {
        boolean onItemChildLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnItemClickListener {
        void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnItemLongClickListener {
        boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface RequestLoadMoreListener {
        void onLoadMoreRequested();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface SpanSizeLookup {
        int getSpanSize(GridLayoutManager gridLayoutManager, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface UpFetchListener {
        void onUpFetch();
    }

    public BaseQuickAdapter(int i11, List<T> list) {
        this.mNextLoadEnable = false;
        this.mLoadMoreEnable = false;
        this.mLoading = false;
        this.mLoadMoreView = new SimpleLoadMoreView();
        this.mEnableLoadMoreEndClick = false;
        this.mFirstOnlyEnable = true;
        this.mOpenAnimationEnable = false;
        this.mInterpolator = new LinearInterpolator();
        this.mDuration = LogSeverity.NOTICE_VALUE;
        this.mLastPosition = -1;
        this.mSelectAnimation = new AlphaInAnimation();
        this.mIsUseEmpty = true;
        this.mPreLoadNumber = 1;
        this.mStartUpFetchPosition = 1;
        this.mData = list == null ? new ArrayList<>() : list;
        if (i11 != 0) {
            this.mLayoutResId = i11;
        }
    }

    private void addAnimation(g2 g2Var) {
        if (this.mOpenAnimationEnable) {
            if (!this.mFirstOnlyEnable || g2Var.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation baseAnimation = this.mCustomAnimation;
                if (baseAnimation == null) {
                    baseAnimation = this.mSelectAnimation;
                }
                for (Animator animator : baseAnimation.getAnimators(g2Var.itemView)) {
                    startAnim(animator, g2Var.getLayoutPosition());
                }
                this.mLastPosition = g2Var.getLayoutPosition();
            }
        }
    }

    private void autoLoadMore(int i11) {
        if (getLoadMoreViewCount() != 0 && i11 >= getItemCount() - this.mPreLoadNumber && this.mLoadMoreView.getLoadMoreStatus() == 1) {
            this.mLoadMoreView.setLoadMoreStatus(2);
            if (this.mLoading) {
                return;
            }
            this.mLoading = true;
            if (getRecyclerView() != null) {
                getRecyclerView().post(new Runnable() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.7
                    @Override // java.lang.Runnable
                    public void run() {
                        BaseQuickAdapter.this.mRequestLoadMoreListener.onLoadMoreRequested();
                    }
                });
            } else {
                this.mRequestLoadMoreListener.onLoadMoreRequested();
            }
        }
    }

    private void autoUpFetch(int i11) {
        UpFetchListener upFetchListener;
        if (!isUpFetchEnable() || isUpFetching() || i11 > this.mStartUpFetchPosition || (upFetchListener = this.mUpFetchListener) == null) {
            return;
        }
        upFetchListener.onUpFetch();
    }

    private void checkNotNull() {
        if (getRecyclerView() == null) {
            throw new IllegalStateException("please bind recyclerView first!");
        }
    }

    private void compatibilityDataSizeChanged(int i11) {
        List<T> list = this.mData;
        if ((list == null ? 0 : list.size()) == i11) {
            notifyDataSetChanged();
        }
    }

    private K createGenericKInstance(Class cls, View view) {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(View.class);
                declaredConstructor.setAccessible(true);
                return (K) declaredConstructor.newInstance(view);
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            declaredConstructor2.setAccessible(true);
            return (K) declaredConstructor2.newInstance(this, view);
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
            return null;
        } catch (InstantiationException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchMethodException e11) {
            e11.printStackTrace();
            return null;
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
            return null;
        }
    }

    private IExpandable getExpandableItem(int i11) {
        T item = getItem(i11);
        if (isExpandable(item)) {
            return (IExpandable) item;
        }
        return null;
    }

    private int getFooterViewPosition() {
        int i11 = 1;
        if (getEmptyViewCount() != 1) {
            return this.mData.size() + getHeaderLayoutCount();
        }
        if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
            i11 = 2;
        }
        if (this.mFootAndEmptyEnable) {
            return i11;
        }
        return -1;
    }

    private int getHeaderViewPosition() {
        return (getEmptyViewCount() != 1 || this.mHeadAndEmptyEnable) ? 0 : -1;
    }

    private Class getInstancedGenericKClass(Class cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (BaseViewHolder.class.isAssignableFrom(cls2)) {
                    return cls2;
                }
            } else if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    Class cls3 = (Class) rawType;
                    if (BaseViewHolder.class.isAssignableFrom(cls3)) {
                        return cls3;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    private int getItemPosition(T t6) {
        List<T> list;
        if (t6 == null || (list = this.mData) == null || list.isEmpty()) {
            return -1;
        }
        return this.mData.indexOf(t6);
    }

    private K getLoadingView(ViewGroup viewGroup) {
        K k11 = (K) createBaseViewHolder(getItemView(this.mLoadMoreView.getLayoutId(), viewGroup));
        k11.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BaseQuickAdapter.this.mLoadMoreView.getLoadMoreStatus() == 3) {
                    BaseQuickAdapter.this.notifyLoadMoreToLoading();
                }
                if (BaseQuickAdapter.this.mEnableLoadMoreEndClick && BaseQuickAdapter.this.mLoadMoreView.getLoadMoreStatus() == 4) {
                    BaseQuickAdapter.this.notifyLoadMoreToLoading();
                }
            }
        });
        return k11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTheBiggestNumber(int[] iArr) {
        int i11 = -1;
        if (iArr != null && iArr.length != 0) {
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFullScreen(LinearLayoutManager linearLayoutManager) {
        return (linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 == getItemCount() && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    private void openLoadMore(RequestLoadMoreListener requestLoadMoreListener) {
        this.mRequestLoadMoreListener = requestLoadMoreListener;
        this.mNextLoadEnable = true;
        this.mLoadMoreEnable = true;
        this.mLoading = false;
    }

    private int recursiveCollapse(int i11) {
        T item = getItem(i11);
        if (item == null || !isExpandable(item)) {
            return 0;
        }
        IExpandable iExpandable = (IExpandable) item;
        if (!iExpandable.isExpanded()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        int level = iExpandable.getLevel();
        int size = this.mData.size();
        for (int i12 = i11 + 1; i12 < size; i12++) {
            T t6 = this.mData.get(i12);
            if ((t6 instanceof IExpandable) && ((IExpandable) t6).getLevel() <= level) {
                break;
            }
            arrayList.add(t6);
        }
        this.mData.removeAll(arrayList);
        return arrayList.size();
    }

    private int recursiveExpand(int i11, List list) {
        int size = list.size();
        int size2 = (list.size() + i11) - 1;
        int size3 = list.size() - 1;
        while (size3 >= 0) {
            if (list.get(size3) instanceof IExpandable) {
                IExpandable iExpandable = (IExpandable) list.get(size3);
                if (iExpandable.isExpanded() && hasSubItems(iExpandable)) {
                    List<T> subItems = iExpandable.getSubItems();
                    int i12 = size2 + 1;
                    this.mData.addAll(i12, subItems);
                    size += recursiveExpand(i12, subItems);
                }
            }
            size3--;
            size2--;
        }
        return size;
    }

    private void setRecyclerView(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    @Deprecated
    public void add(int i11, T t6) {
        addData(i11, t6);
    }

    public void addData(int i11, T t6) {
        this.mData.add(i11, t6);
        notifyItemInserted(getHeaderLayoutCount() + i11);
        compatibilityDataSizeChanged(1);
    }

    public int addFooterView(View view) {
        return addFooterView(view, -1, 1);
    }

    public int addHeaderView(View view) {
        return addHeaderView(view, -1);
    }

    public void bindToRecyclerView(RecyclerView recyclerView) {
        if (getRecyclerView() == recyclerView) {
            throw new IllegalStateException("Don't bind twice");
        }
        setRecyclerView(recyclerView);
        getRecyclerView().setAdapter(this);
    }

    public void bindViewClickListener(final K k11) {
        if (k11 == null) {
            return;
        }
        View view = k11.itemView;
        if (getOnItemClickListener() != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int adapterPosition = k11.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return;
                    }
                    BaseQuickAdapter.this.setOnItemClick(view2, adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount());
                }
            });
        }
        if (getOnItemLongClickListener() != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.6
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    int adapterPosition = k11.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return false;
                    }
                    return BaseQuickAdapter.this.setOnItemLongClick(view2, adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount());
                }
            });
        }
    }

    public void closeLoadAnimation() {
        this.mOpenAnimationEnable = false;
    }

    public int collapse(int i11, boolean z11, boolean z12) {
        int headerLayoutCount = i11 - getHeaderLayoutCount();
        IExpandable expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null) {
            return 0;
        }
        int iRecursiveCollapse = recursiveCollapse(headerLayoutCount);
        expandableItem.setExpanded(false);
        int headerLayoutCount2 = getHeaderLayoutCount() + headerLayoutCount;
        if (z12) {
            if (z11) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeRemoved(headerLayoutCount2 + 1, iRecursiveCollapse);
                return iRecursiveCollapse;
            }
            notifyDataSetChanged();
        }
        return iRecursiveCollapse;
    }

    public abstract void convert(K k11, T t6);

    public K createBaseViewHolder(ViewGroup viewGroup, int i11) {
        return (K) createBaseViewHolder(getItemView(i11, viewGroup));
    }

    public void disableLoadMoreIfNotFullPage() {
        checkNotNull();
        disableLoadMoreIfNotFullPage(getRecyclerView());
    }

    public void enableLoadMoreEndClick(boolean z11) {
        this.mEnableLoadMoreEndClick = z11;
    }

    public int expand(int i11, boolean z11, boolean z12) {
        int headerLayoutCount = i11 - getHeaderLayoutCount();
        IExpandable expandableItem = getExpandableItem(headerLayoutCount);
        int iRecursiveExpand = 0;
        if (expandableItem == null) {
            return 0;
        }
        if (!hasSubItems(expandableItem)) {
            expandableItem.setExpanded(true);
            notifyItemChanged(headerLayoutCount);
            return 0;
        }
        if (!expandableItem.isExpanded()) {
            List<T> subItems = expandableItem.getSubItems();
            int i12 = headerLayoutCount + 1;
            this.mData.addAll(i12, subItems);
            iRecursiveExpand = recursiveExpand(i12, subItems);
            expandableItem.setExpanded(true);
        }
        int headerLayoutCount2 = getHeaderLayoutCount() + headerLayoutCount;
        if (z12) {
            if (z11) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeInserted(headerLayoutCount2 + 1, iRecursiveExpand);
                return iRecursiveExpand;
            }
            notifyDataSetChanged();
        }
        return iRecursiveExpand;
    }

    public int expandAll(int i11, boolean z11, boolean z12) {
        T item;
        int headerLayoutCount = i11 - getHeaderLayoutCount();
        int i12 = headerLayoutCount + 1;
        T item2 = i12 < this.mData.size() ? getItem(i12) : null;
        IExpandable expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null) {
            return 0;
        }
        if (!hasSubItems(expandableItem)) {
            expandableItem.setExpanded(true);
            notifyItemChanged(headerLayoutCount);
            return 0;
        }
        int iExpand = expand(getHeaderLayoutCount() + headerLayoutCount, false, false);
        while (i12 < this.mData.size() && ((item = getItem(i12)) == null || !item.equals(item2))) {
            if (isExpandable(item)) {
                iExpand = expand(getHeaderLayoutCount() + i12, false, false) + iExpand;
            }
            i12++;
        }
        if (z12) {
            if (z11) {
                notifyItemRangeInserted(getHeaderLayoutCount() + headerLayoutCount + 1, iExpand);
                return iExpand;
            }
            notifyDataSetChanged();
        }
        return iExpand;
    }

    public List<T> getData() {
        return this.mData;
    }

    public int getDefItemViewType(int i11) {
        return super.getItemViewType(i11);
    }

    public View getEmptyView() {
        return this.mEmptyLayout;
    }

    public int getEmptyViewCount() {
        FrameLayout frameLayout = this.mEmptyLayout;
        return (frameLayout == null || frameLayout.getChildCount() == 0 || !this.mIsUseEmpty || this.mData.size() != 0) ? 0 : 1;
    }

    public LinearLayout getFooterLayout() {
        return this.mFooterLayout;
    }

    public int getFooterLayoutCount() {
        LinearLayout linearLayout = this.mFooterLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getFooterViewsCount() {
        return getFooterLayoutCount();
    }

    public LinearLayout getHeaderLayout() {
        return this.mHeaderLayout;
    }

    public int getHeaderLayoutCount() {
        LinearLayout linearLayout = this.mHeaderLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getHeaderViewsCount() {
        return getHeaderLayoutCount();
    }

    public T getItem(int i11) {
        if (i11 < 0 || i11 >= this.mData.size()) {
            return null;
        }
        return this.mData.get(i11);
    }

    @Override // androidx.recyclerview.widget.b1
    public int getItemCount() {
        if (1 != getEmptyViewCount()) {
            return getLoadMoreViewCount() + getFooterLayoutCount() + this.mData.size() + getHeaderLayoutCount();
        }
        int i11 = (!this.mHeadAndEmptyEnable || getHeaderLayoutCount() == 0) ? 1 : 2;
        return (!this.mFootAndEmptyEnable || getFooterLayoutCount() == 0) ? i11 : i11 + 1;
    }

    @Override // androidx.recyclerview.widget.b1
    public long getItemId(int i11) {
        return i11;
    }

    public View getItemView(int i11, ViewGroup viewGroup) {
        return this.mLayoutInflater.inflate(i11, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.b1
    public int getItemViewType(int i11) {
        if (getEmptyViewCount() == 1) {
            boolean z11 = this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0;
            if (i11 == 0) {
                return z11 ? HEADER_VIEW : EMPTY_VIEW;
            }
            if (i11 != 1) {
                return i11 != 2 ? EMPTY_VIEW : FOOTER_VIEW;
            }
            return z11 ? EMPTY_VIEW : FOOTER_VIEW;
        }
        int headerLayoutCount = getHeaderLayoutCount();
        if (i11 < headerLayoutCount) {
            return HEADER_VIEW;
        }
        int i12 = i11 - headerLayoutCount;
        int size = this.mData.size();
        if (i12 < size) {
            return getDefItemViewType(i12);
        }
        return i12 - size < getFooterLayoutCount() ? FOOTER_VIEW : LOADING_VIEW;
    }

    public int getLoadMoreViewCount() {
        if (this.mRequestLoadMoreListener == null || !this.mLoadMoreEnable) {
            return 0;
        }
        return ((this.mNextLoadEnable || !this.mLoadMoreView.isLoadEndMoreGone()) && this.mData.size() != 0) ? 1 : 0;
    }

    public int getLoadMoreViewPosition() {
        return getFooterLayoutCount() + this.mData.size() + getHeaderLayoutCount();
    }

    public final OnItemChildClickListener getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    public final OnItemChildLongClickListener getOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    public final OnItemClickListener getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public final OnItemLongClickListener getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public int getParentPosition(T t6) {
        int itemPosition = getItemPosition(t6);
        if (itemPosition == -1) {
            return -1;
        }
        int level = t6 instanceof IExpandable ? ((IExpandable) t6).getLevel() : Integer.MAX_VALUE;
        if (level == 0) {
            return itemPosition;
        }
        if (level == -1) {
            return -1;
        }
        while (itemPosition >= 0) {
            T t8 = this.mData.get(itemPosition);
            if (t8 instanceof IExpandable) {
                IExpandable iExpandable = (IExpandable) t8;
                if (iExpandable.getLevel() >= 0 && iExpandable.getLevel() < level) {
                    return itemPosition;
                }
            }
            itemPosition--;
        }
        return -1;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public View getViewByPosition(int i11, int i12) {
        checkNotNull();
        return getViewByPosition(getRecyclerView(), i11, i12);
    }

    public boolean hasSubItems(IExpandable iExpandable) {
        List<T> subItems;
        return (iExpandable == null || (subItems = iExpandable.getSubItems()) == null || subItems.size() <= 0) ? false : true;
    }

    public boolean isExpandable(T t6) {
        return t6 != null && (t6 instanceof IExpandable);
    }

    public void isFirstOnly(boolean z11) {
        this.mFirstOnlyEnable = z11;
    }

    public boolean isFixedViewType(int i11) {
        return i11 == 1365 || i11 == 273 || i11 == 819 || i11 == 546;
    }

    public boolean isFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public boolean isHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public boolean isLoadMoreEnable() {
        return this.mLoadMoreEnable;
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    public boolean isUpFetchEnable() {
        return this.mUpFetchEnable;
    }

    public boolean isUpFetching() {
        return this.mUpFetching;
    }

    public void isUseEmpty(boolean z11) {
        this.mIsUseEmpty = z11;
    }

    public void loadMoreComplete() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = true;
        this.mLoadMoreView.setLoadMoreStatus(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public void loadMoreEnd() {
        loadMoreEnd(false);
    }

    public void loadMoreFail() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mLoadMoreView.setLoadMoreStatus(3);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public void notifyLoadMoreToLoading() {
        if (this.mLoadMoreView.getLoadMoreStatus() == 2) {
            return;
        }
        this.mLoadMoreView.setLoadMoreStatus(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    @Override // androidx.recyclerview.widget.b1
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        m1 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final f0 f0Var = gridLayoutManager.f2390t;
            gridLayoutManager.f2390t = new f0() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.4
                @Override // androidx.recyclerview.widget.f0
                public int getSpanSize(int i11) {
                    int itemViewType = BaseQuickAdapter.this.getItemViewType(i11);
                    if (itemViewType == 273 && BaseQuickAdapter.this.isHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 819 && BaseQuickAdapter.this.isFooterViewAsFlow()) {
                        return 1;
                    }
                    if (BaseQuickAdapter.this.mSpanSizeLookup == null) {
                        return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? gridLayoutManager.f2385b : f0Var.getSpanSize(i11);
                    }
                    return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? gridLayoutManager.f2385b : BaseQuickAdapter.this.mSpanSizeLookup.getSpanSize(gridLayoutManager, i11 - BaseQuickAdapter.this.getHeaderLayoutCount());
                }
            };
        }
    }

    public K onCreateDefViewHolder(ViewGroup viewGroup, int i11) {
        return (K) createBaseViewHolder(viewGroup, this.mLayoutResId);
    }

    public void openLoadAnimation(int i11) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = null;
        if (i11 == 1) {
            this.mSelectAnimation = new AlphaInAnimation();
            return;
        }
        if (i11 == 2) {
            this.mSelectAnimation = new ScaleInAnimation();
            return;
        }
        if (i11 == 3) {
            this.mSelectAnimation = new SlideInBottomAnimation();
        } else if (i11 == 4) {
            this.mSelectAnimation = new SlideInLeftAnimation();
        } else {
            if (i11 != 5) {
                return;
            }
            this.mSelectAnimation = new SlideInRightAnimation();
        }
    }

    public final void refreshNotifyItemChanged(int i11) {
        notifyItemChanged(getHeaderLayoutCount() + i11);
    }

    public void remove(int i11) {
        this.mData.remove(i11);
        int headerLayoutCount = getHeaderLayoutCount() + i11;
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.mData.size() - headerLayoutCount);
    }

    public void removeAllFooterView() {
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.mFooterLayout.removeAllViews();
        int footerViewPosition = getFooterViewPosition();
        if (footerViewPosition != -1) {
            notifyItemRemoved(footerViewPosition);
        }
    }

    public void removeAllHeaderView() {
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.mHeaderLayout.removeAllViews();
        int headerViewPosition = getHeaderViewPosition();
        if (headerViewPosition != -1) {
            notifyItemRemoved(headerViewPosition);
        }
    }

    public void removeFooterView(View view) {
        int footerViewPosition;
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.mFooterLayout.removeView(view);
        if (this.mFooterLayout.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(footerViewPosition);
    }

    public void removeHeaderView(View view) {
        int headerViewPosition;
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.mHeaderLayout.removeView(view);
        if (this.mHeaderLayout.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(headerViewPosition);
    }

    public void replaceData(Collection<? extends T> collection) {
        List<T> list = this.mData;
        if (collection != list) {
            list.clear();
            this.mData.addAll(collection);
        }
        notifyDataSetChanged();
    }

    @Deprecated
    public void setAutoLoadMoreSize(int i11) {
        setPreLoadNumber(i11);
    }

    public void setData(int i11, T t6) {
        this.mData.set(i11, t6);
        notifyItemChanged(getHeaderLayoutCount() + i11);
    }

    public void setDuration(int i11) {
        this.mDuration = i11;
    }

    public void setEmptyView(int i11, ViewGroup viewGroup) {
        setEmptyView(LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false));
    }

    public void setEnableLoadMore(boolean z11) {
        int loadMoreViewCount = getLoadMoreViewCount();
        this.mLoadMoreEnable = z11;
        int loadMoreViewCount2 = getLoadMoreViewCount();
        if (loadMoreViewCount == 1) {
            if (loadMoreViewCount2 == 0) {
                notifyItemRemoved(getLoadMoreViewPosition());
            }
        } else if (loadMoreViewCount2 == 1) {
            this.mLoadMoreView.setLoadMoreStatus(1);
            notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public int setFooterView(View view) {
        return setFooterView(view, 0, 1);
    }

    public void setFooterViewAsFlow(boolean z11) {
        this.footerViewAsFlow = z11;
    }

    public void setFullSpan(g2 g2Var) {
        if (g2Var.itemView.getLayoutParams() instanceof m2) {
            ((m2) g2Var.itemView.getLayoutParams()).f2540f = true;
        }
    }

    public void setHeaderAndEmpty(boolean z11) {
        setHeaderFooterEmpty(z11, false);
    }

    public void setHeaderFooterEmpty(boolean z11, boolean z12) {
        this.mHeadAndEmptyEnable = z11;
        this.mFootAndEmptyEnable = z12;
    }

    public int setHeaderView(View view) {
        return setHeaderView(view, 0, 1);
    }

    public void setHeaderViewAsFlow(boolean z11) {
        this.headerViewAsFlow = z11;
    }

    public void setLoadMoreView(LoadMoreView loadMoreView) {
        this.mLoadMoreView = loadMoreView;
    }

    public void setNewData(List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mData = list;
        if (this.mRequestLoadMoreListener != null) {
            this.mNextLoadEnable = true;
            this.mLoadMoreEnable = true;
            this.mLoading = false;
            this.mLoadMoreView.setLoadMoreStatus(1);
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
    }

    public void setNewDiffData(BaseQuickDiffCallback<T> baseQuickDiffCallback) {
        setNewDiffData((BaseQuickDiffCallback) baseQuickDiffCallback, false);
    }

    public void setNotDoAnimationCount(int i11) {
        this.mLastPosition = i11;
    }

    public void setOnItemChildClickListener(OnItemChildClickListener onItemChildClickListener) {
        this.mOnItemChildClickListener = onItemChildClickListener;
    }

    public void setOnItemChildLongClickListener(OnItemChildLongClickListener onItemChildLongClickListener) {
        this.mOnItemChildLongClickListener = onItemChildLongClickListener;
    }

    public void setOnItemClick(View view, int i11) {
        getOnItemClickListener().onItemClick(this, view, i11);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public boolean setOnItemLongClick(View view, int i11) {
        return getOnItemLongClickListener().onItemLongClick(this, view, i11);
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    @Deprecated
    public void setOnLoadMoreListener(RequestLoadMoreListener requestLoadMoreListener) {
        openLoadMore(requestLoadMoreListener);
    }

    public void setPreLoadNumber(int i11) {
        if (i11 > 1) {
            this.mPreLoadNumber = i11;
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public void setStartUpFetchPosition(int i11) {
        this.mStartUpFetchPosition = i11;
    }

    public void setUpFetchEnable(boolean z11) {
        this.mUpFetchEnable = z11;
    }

    public void setUpFetchListener(UpFetchListener upFetchListener) {
        this.mUpFetchListener = upFetchListener;
    }

    public void setUpFetching(boolean z11) {
        this.mUpFetching = z11;
    }

    public void startAnim(Animator animator, int i11) {
        animator.setDuration(this.mDuration).start();
        animator.setInterpolator(this.mInterpolator);
    }

    public int addFooterView(View view, int i11) {
        return addFooterView(view, i11, 1);
    }

    public int addHeaderView(View view, int i11) {
        return addHeaderView(view, i11, 1);
    }

    public K createBaseViewHolder(View view) {
        Class instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        K k11 = instancedGenericKClass == null ? (K) new BaseViewHolder(view) : (K) createGenericKInstance(instancedGenericKClass, view);
        return k11 != null ? k11 : (K) new BaseViewHolder(view);
    }

    public void loadMoreEnd(boolean z11) {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = false;
        this.mLoadMoreView.setLoadMoreEndGone(z11);
        if (z11) {
            notifyItemRemoved(getLoadMoreViewPosition());
        } else {
            this.mLoadMoreView.setLoadMoreStatus(4);
            notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public /* bridge */ /* synthetic */ void onBindViewHolder(g2 g2Var, int i11, List list) {
        onBindViewHolder((BaseViewHolder) g2Var, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.b1
    public K onCreateViewHolder(ViewGroup viewGroup, int i11) {
        K k11;
        Context context = viewGroup.getContext();
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        if (i11 == 273) {
            ViewParent parent = this.mHeaderLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mHeaderLayout);
            }
            k11 = (K) createBaseViewHolder(this.mHeaderLayout);
        } else if (i11 == 546) {
            k11 = (K) getLoadingView(viewGroup);
        } else if (i11 == 819) {
            ViewParent parent2 = this.mFooterLayout.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.mFooterLayout);
            }
            k11 = (K) createBaseViewHolder(this.mFooterLayout);
        } else if (i11 != 1365) {
            k11 = (K) onCreateDefViewHolder(viewGroup, i11);
            bindViewClickListener(k11);
        } else {
            ViewParent parent3 = this.mEmptyLayout.getParent();
            if (parent3 instanceof ViewGroup) {
                ((ViewGroup) parent3).removeView(this.mEmptyLayout);
            }
            k11 = (K) createBaseViewHolder(this.mEmptyLayout);
        }
        k11.setAdapter(this);
        return k11;
    }

    @Override // androidx.recyclerview.widget.b1
    public void onViewAttachedToWindow(K k11) {
        super.onViewAttachedToWindow((g2) k11);
        int itemViewType = k11.getItemViewType();
        if (itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) {
            setFullSpan(k11);
        } else {
            addAnimation(k11);
        }
    }

    public final void refreshNotifyItemChanged(int i11, Object obj) {
        notifyItemChanged(getHeaderLayoutCount() + i11, obj);
    }

    public int setFooterView(View view, int i11) {
        return setFooterView(view, i11, 1);
    }

    public int setHeaderView(View view, int i11) {
        return setHeaderView(view, i11, 1);
    }

    public void setNewDiffData(BaseQuickDiffCallback<T> baseQuickDiffCallback, boolean z11) {
        if (getEmptyViewCount() == 1) {
            setNewData(baseQuickDiffCallback.getNewList());
            return;
        }
        baseQuickDiffCallback.setOldList(getData());
        u.a(baseQuickDiffCallback, z11).a(new BaseQuickAdapterListUpdateCallback(this));
        this.mData = baseQuickDiffCallback.getNewList();
    }

    public void setOnLoadMoreListener(RequestLoadMoreListener requestLoadMoreListener, RecyclerView recyclerView) {
        openLoadMore(requestLoadMoreListener);
        if (getRecyclerView() == null) {
            setRecyclerView(recyclerView);
        }
    }

    public int addFooterView(View view, int i11, int i12) {
        int footerViewPosition;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            if (i12 == 1) {
                linearLayout.setOrientation(1);
                this.mFooterLayout.setLayoutParams(new n1(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mFooterLayout.setLayoutParams(new n1(-2, -1));
            }
        }
        int childCount = this.mFooterLayout.getChildCount();
        if (i11 < 0 || i11 > childCount) {
            i11 = childCount;
        }
        this.mFooterLayout.addView(view, i11);
        if (this.mFooterLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i11;
    }

    public int addHeaderView(View view, int i11, int i12) {
        int headerViewPosition;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            if (i12 == 1) {
                linearLayout.setOrientation(1);
                this.mHeaderLayout.setLayoutParams(new n1(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mHeaderLayout.setLayoutParams(new n1(-2, -1));
            }
        }
        int childCount = this.mHeaderLayout.getChildCount();
        if (i11 < 0 || i11 > childCount) {
            i11 = childCount;
        }
        this.mHeaderLayout.addView(view, i11);
        if (this.mHeaderLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i11;
    }

    public void disableLoadMoreIfNotFullPage(RecyclerView recyclerView) {
        m1 layoutManager;
        setEnableLoadMore(false);
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            recyclerView.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    if (BaseQuickAdapter.this.isFullScreen(linearLayoutManager)) {
                        BaseQuickAdapter.this.setEnableLoadMore(true);
                    }
                }
            }, 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            final StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            recyclerView.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.BaseQuickAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = staggeredGridLayoutManager;
                    int i11 = staggeredGridLayoutManager2.f2391a;
                    int[] iArr = new int[i11];
                    staggeredGridLayoutManager2.getClass();
                    if (i11 < staggeredGridLayoutManager2.f2391a) {
                        throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + staggeredGridLayoutManager2.f2391a + ", array size:" + i11);
                    }
                    for (int i12 = 0; i12 < staggeredGridLayoutManager2.f2391a; i12++) {
                        p2 p2Var = staggeredGridLayoutManager2.f2392b[i12];
                        ArrayList arrayList = (ArrayList) p2Var.f2589f;
                        iArr[i12] = ((StaggeredGridLayoutManager) p2Var.f2590g).H ? p2Var.i(0, arrayList.size(), true, true, false) : p2Var.i(arrayList.size() - 1, -1, true, true, false);
                    }
                    if (BaseQuickAdapter.this.getTheBiggestNumber(iArr) + 1 != BaseQuickAdapter.this.getItemCount()) {
                        BaseQuickAdapter.this.setEnableLoadMore(true);
                    }
                }
            }, 50L);
        }
    }

    public View getViewByPosition(RecyclerView recyclerView, int i11, int i12) {
        BaseViewHolder baseViewHolder;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i11)) == null) {
            return null;
        }
        return baseViewHolder.getView(i12);
    }

    @Override // androidx.recyclerview.widget.b1
    public void onBindViewHolder(K k11, int i11) {
        autoUpFetch(i11);
        autoLoadMore(i11);
        int itemViewType = k11.getItemViewType();
        if (itemViewType == 0) {
            convert(k11, getItem(i11 - getHeaderLayoutCount()));
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.convert(k11);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                convert(k11, getItem(i11 - getHeaderLayoutCount()));
            }
        }
    }

    @Deprecated
    public void setEmptyView(int i11) {
        checkNotNull();
        setEmptyView(i11, getRecyclerView());
    }

    public int setFooterView(View view, int i11, int i12) {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i11) {
            this.mFooterLayout.removeViewAt(i11);
            this.mFooterLayout.addView(view, i11);
            return i11;
        }
        return addFooterView(view, i11, i12);
    }

    public int setHeaderView(View view, int i11, int i12) {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i11) {
            this.mHeaderLayout.removeViewAt(i11);
            this.mHeaderLayout.addView(view, i11);
            return i11;
        }
        return addHeaderView(view, i11, i12);
    }

    public void addData(T t6) {
        this.mData.add(t6);
        notifyItemInserted(getHeaderLayoutCount() + this.mData.size());
        compatibilityDataSizeChanged(1);
    }

    public void setEmptyView(View view) {
        boolean z11;
        int itemCount = getItemCount();
        if (this.mEmptyLayout == null) {
            this.mEmptyLayout = new FrameLayout(view.getContext());
            n1 n1Var = new n1(-1, -1);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) n1Var).width = layoutParams.width;
                ((ViewGroup.MarginLayoutParams) n1Var).height = layoutParams.height;
            }
            this.mEmptyLayout.setLayoutParams(n1Var);
            z11 = true;
        } else {
            z11 = false;
        }
        this.mEmptyLayout.removeAllViews();
        this.mEmptyLayout.addView(view);
        this.mIsUseEmpty = true;
        if (z11 && getEmptyViewCount() == 1) {
            int i11 = (!this.mHeadAndEmptyEnable || getHeaderLayoutCount() == 0) ? 0 : 1;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i11);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public void addData(int i11, Collection<? extends T> collection) {
        this.mData.addAll(i11, collection);
        notifyItemRangeInserted(getHeaderLayoutCount() + i11, collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public void openLoadAnimation(BaseAnimation baseAnimation) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = baseAnimation;
    }

    public void setNewDiffData(p pVar, List<T> list) {
        if (getEmptyViewCount() == 1) {
            setNewData(list);
        } else {
            pVar.a(new BaseQuickAdapterListUpdateCallback(this));
            this.mData = list;
        }
    }

    public int collapse(int i11) {
        return collapse(i11, true, true);
    }

    public void onBindViewHolder(K k11, int i11, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder((BaseViewHolder) k11, i11);
            return;
        }
        autoUpFetch(i11);
        autoLoadMore(i11);
        int itemViewType = k11.getItemViewType();
        if (itemViewType == 0) {
            convertPayloads(k11, getItem(i11 - getHeaderLayoutCount()), list);
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.convert(k11);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                convertPayloads(k11, getItem(i11 - getHeaderLayoutCount()), list);
            }
        }
    }

    public void addData(Collection<? extends T> collection) {
        this.mData.addAll(collection);
        notifyItemRangeInserted(getHeaderLayoutCount() + (this.mData.size() - collection.size()), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public int collapse(int i11, boolean z11) {
        return collapse(i11, z11, true);
    }

    public void openLoadAnimation() {
        this.mOpenAnimationEnable = true;
    }

    public int expand(int i11, boolean z11) {
        return expand(i11, z11, true);
    }

    public int expand(int i11) {
        return expand(i11, true, true);
    }

    public int expandAll(int i11, boolean z11) {
        return expandAll(i11, true, !z11);
    }

    public void expandAll() {
        for (int headerLayoutCount = getHeaderLayoutCount() + (this.mData.size() - 1); headerLayoutCount >= getHeaderLayoutCount(); headerLayoutCount--) {
            expandAll(headerLayoutCount, false, false);
        }
    }

    public BaseQuickAdapter(List<T> list) {
        this(0, list);
    }

    public BaseQuickAdapter(int i11) {
        this(i11, null);
    }

    public void convertPayloads(K k11, T t6, List<Object> list) {
    }
}
