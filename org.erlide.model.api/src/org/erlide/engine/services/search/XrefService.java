package org.erlide.engine.services.search;

import org.erlide.engine.model.erlang.FunctionRef;
import org.erlide.engine.model.root.IErlProject;
import org.erlide.runtime.rpc.IRpcFuture;

public interface XrefService {

    public abstract void start();

    public abstract void stop();

    public abstract IRpcFuture addProject(IErlProject project);

    public abstract void update();

    public abstract FunctionRef[] functionUse(String mod, String fun, int arity);

    public abstract FunctionRef[] functionUse(FunctionRef ref);

}