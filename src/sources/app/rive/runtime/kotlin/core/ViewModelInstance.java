package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ViewModelException;
import fz.c;
import fz.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInstance extends NativeObject {
    public static final int $stable = 8;
    private Map<String, ViewModelInstance> children;
    private Map<String, ViewModelProperty<?>> properties;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Transfer {
        public static final int $stable = 8;
        private final ViewModelInstance instance;
        private boolean valid;

        public Transfer(ViewModelInstance instance) throws ViewModelException {
            m.f(instance, "instance");
            this.instance = instance;
            this.valid = true;
            if (instance.getRefCount() <= 0) {
                throw new ViewModelException("Cannot transfer a disposed ViewModelInstance.");
            }
            instance.cppRefInstance(instance.getCppPointer());
            instance.acquire();
        }

        public final void dispose() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                this.instance.release();
            } else {
                throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot dispose.");
            }
        }

        public final ViewModelInstance end$kotlin_release() {
            if (this.valid) {
                this.valid = false;
                return this.instance;
            }
            throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot end transfer again.");
        }
    }

    public ViewModelInstance(long j11) {
        super(j11);
        this.properties = new LinkedHashMap();
        this.children = new LinkedHashMap();
        cppRefInstance(getCppPointer());
    }

    private final native void cppDerefInstance(long j11);

    private final native String cppName(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyArtboard(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyBoolean(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyColor(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyEnum(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyImage(long j11, String str);

    private final native long cppPropertyInstance(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyList(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyNumber(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyString(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyTrigger(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppRefInstance(long j11);

    private final native boolean cppSetInstanceProperty(long j11, String str, long j12);

    private final <T extends ViewModelProperty<?>> T getProperty(String str, e eVar, c cVar) throws ViewModelException {
        List listW0 = q.W0(str, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str2 = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        if (viewModelInstanceTraverse.properties.get(str2) != null) {
            m.m();
            throw null;
        }
        long jLongValue = ((Number) eVar.invoke(Long.valueOf(viewModelInstanceTraverse.getCppPointer()), str2)).longValue();
        if (jLongValue == 0) {
            throw new ViewModelException("Property not found: ".concat(str));
        }
        T t6 = (T) cVar.invoke(Long.valueOf(jLongValue));
        viewModelInstanceTraverse.properties.put(str2, t6);
        getDependencies().add(t6);
        return t6;
    }

    private final ViewModelInstance traverse(List<String> list) throws ViewModelException {
        if (list.isEmpty()) {
            return this;
        }
        String str = (String) ry.m.q0(list);
        Map<String, ViewModelInstance> map = this.children;
        ViewModelInstance viewModelInstanceTraverse$createChildInstance = map.get(str);
        if (viewModelInstanceTraverse$createChildInstance == null) {
            viewModelInstanceTraverse$createChildInstance = traverse$createChildInstance(this, str);
            map.put(str, viewModelInstanceTraverse$createChildInstance);
        }
        return viewModelInstanceTraverse$createChildInstance.traverse(list.subList(1, list.size()));
    }

    private static final ViewModelInstance traverse$createChildInstance(ViewModelInstance viewModelInstance, String str) throws ViewModelException {
        long jCppPropertyInstance = viewModelInstance.cppPropertyInstance(viewModelInstance.getCppPointer(), str);
        if (jCppPropertyInstance == 0) {
            throw new ViewModelException(ep.a.e("Property not found: ", str));
        }
        ViewModelInstance viewModelInstance2 = new ViewModelInstance(jCppPropertyInstance);
        viewModelInstance.children.put(str, viewModelInstance2);
        viewModelInstance.getDependencies().add(viewModelInstance2);
        return viewModelInstance2;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long j11) {
        cppDerefInstance(j11);
    }

    public final ViewModelArtboardProperty getArtboardProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyArtboard = cppPropertyArtboard(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyArtboard == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelArtboardProperty viewModelArtboardProperty = new ViewModelArtboardProperty(jCppPropertyArtboard);
            viewModelInstanceTraverse.properties.put(str, viewModelArtboardProperty);
            getDependencies().add(viewModelArtboardProperty);
            viewModelProperty = viewModelArtboardProperty;
        } else if (!(viewModelProperty instanceof ViewModelArtboardProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelArtboardProperty) viewModelProperty;
    }

    public final ViewModelBooleanProperty getBooleanProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyBoolean = cppPropertyBoolean(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyBoolean == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelBooleanProperty viewModelBooleanProperty = new ViewModelBooleanProperty(jCppPropertyBoolean);
            viewModelInstanceTraverse.properties.put(str, viewModelBooleanProperty);
            getDependencies().add(viewModelBooleanProperty);
            viewModelProperty = viewModelBooleanProperty;
        } else if (!(viewModelProperty instanceof ViewModelBooleanProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelBooleanProperty) viewModelProperty;
    }

    public final ViewModelColorProperty getColorProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyColor = cppPropertyColor(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyColor == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelColorProperty viewModelColorProperty = new ViewModelColorProperty(jCppPropertyColor);
            viewModelInstanceTraverse.properties.put(str, viewModelColorProperty);
            getDependencies().add(viewModelColorProperty);
            viewModelProperty = viewModelColorProperty;
        } else if (!(viewModelProperty instanceof ViewModelColorProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelColorProperty) viewModelProperty;
    }

    public final ViewModelEnumProperty getEnumProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyEnum = cppPropertyEnum(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyEnum == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelEnumProperty viewModelEnumProperty = new ViewModelEnumProperty(jCppPropertyEnum);
            viewModelInstanceTraverse.properties.put(str, viewModelEnumProperty);
            getDependencies().add(viewModelEnumProperty);
            viewModelProperty = viewModelEnumProperty;
        } else if (!(viewModelProperty instanceof ViewModelEnumProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelEnumProperty) viewModelProperty;
    }

    public final ViewModelImageProperty getImageProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyImage = cppPropertyImage(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyImage == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelImageProperty viewModelImageProperty = new ViewModelImageProperty(jCppPropertyImage);
            viewModelInstanceTraverse.properties.put(str, viewModelImageProperty);
            getDependencies().add(viewModelImageProperty);
            viewModelProperty = viewModelImageProperty;
        } else if (!(viewModelProperty instanceof ViewModelImageProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelImageProperty) viewModelProperty;
    }

    public final ViewModelInstance getInstanceProperty(String path) {
        m.f(path, "path");
        return traverse(q.W0(path, new String[]{"/"}, 0, 6));
    }

    public final ViewModelListProperty getListProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyList = cppPropertyList(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyList == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelListProperty viewModelListProperty = new ViewModelListProperty(jCppPropertyList);
            viewModelInstanceTraverse.properties.put(str, viewModelListProperty);
            getDependencies().add(viewModelListProperty);
            viewModelProperty = viewModelListProperty;
        } else if (!(viewModelProperty instanceof ViewModelListProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelListProperty) viewModelProperty;
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final ViewModelNumberProperty getNumberProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyNumber = cppPropertyNumber(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyNumber == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelNumberProperty viewModelNumberProperty = new ViewModelNumberProperty(jCppPropertyNumber);
            viewModelInstanceTraverse.properties.put(str, viewModelNumberProperty);
            getDependencies().add(viewModelNumberProperty);
            viewModelProperty = viewModelNumberProperty;
        } else if (!(viewModelProperty instanceof ViewModelNumberProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelNumberProperty) viewModelProperty;
    }

    public final ViewModelStringProperty getStringProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyString = cppPropertyString(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyString == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelStringProperty viewModelStringProperty = new ViewModelStringProperty(jCppPropertyString);
            viewModelInstanceTraverse.properties.put(str, viewModelStringProperty);
            getDependencies().add(viewModelStringProperty);
            viewModelProperty = viewModelStringProperty;
        } else if (!(viewModelProperty instanceof ViewModelStringProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelStringProperty) viewModelProperty;
    }

    public final ViewModelTriggerProperty getTriggerProperty(String path) throws ViewModelException {
        m.f(path, "path");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyTrigger = cppPropertyTrigger(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyTrigger == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelTriggerProperty viewModelTriggerProperty = new ViewModelTriggerProperty(jCppPropertyTrigger);
            viewModelInstanceTraverse.properties.put(str, viewModelTriggerProperty);
            getDependencies().add(viewModelTriggerProperty);
            viewModelProperty = viewModelTriggerProperty;
        } else if (!(viewModelProperty instanceof ViewModelTriggerProperty)) {
            throw new ViewModelException(ep.a.g("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelTriggerProperty) viewModelProperty;
    }

    public final void pollChanges$kotlin_release() {
        Collection<ViewModelProperty<?>> collectionValues = this.properties.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((ViewModelProperty) obj).isSubscribed$kotlin_release()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ((ViewModelProperty) obj2).pollChanges$kotlin_release();
        }
        Iterator<T> it = this.children.values().iterator();
        while (it.hasNext()) {
            ((ViewModelInstance) it.next()).pollChanges$kotlin_release();
        }
    }

    public final void setInstanceProperty(String path, ViewModelInstance instance) throws ViewModelException {
        m.f(path, "path");
        m.f(instance, "instance");
        List listW0 = q.W0(path, new String[]{"/"}, 0, 6);
        List<String> listSubList = listW0.subList(0, listW0.size() - 1);
        String str = (String) ry.m.z0(listW0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        if (!cppSetInstanceProperty(viewModelInstanceTraverse.getCppPointer(), str, instance.getCppPointer())) {
            throw new ViewModelException(ep.a.g("Property not found: ", path, "; or instance is incompatible."));
        }
        viewModelInstanceTraverse.children.put(str, instance);
    }

    public final Transfer transfer() {
        return new Transfer(this);
    }
}
