package com.wenhuadesert.oa.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.client.model.ClientModel;
import com.wenhuadesert.oa.client.service.IClientService;
import com.wenhuadesert.oa.goods.model.GoodsModel;
import com.wenhuadesert.oa.restresult.Result;

@RestController
@RequestMapping(value="/client")
@CrossOrigin
public class ClientController {

	@Autowired
	private IClientService cs = null;
	
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody ClientModel em) throws Exception {
		cs.add(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加客户成功");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> modify(@RequestBody ClientModel em) throws Exception {
		cs.modify(em);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改客户成功");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody ClientModel em) throws Exception{
		cs.delete(em);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除客户成功");
		return result;
	}
	
	@RequestMapping(value="/list/all/page")
	public Result<ClientModel> getListByAllWithPage(@RequestParam(required = false,defaultValue = "10")int rows,@RequestParam(required = false,defaultValue = "1")int page) throws Exception{
		Result<ClientModel> result=new Result<ClientModel>();
		result.setCount(cs.getCountByAll());
		result.setPageCount(cs.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);
		result.setList(cs.getListByAllWithPage(rows, page));
		result.setStatus("ok");
		result.setMessage("取得客户列表分页成功");
		return result;
	}
	
	@RequestMapping(value="/list/condition/page")
	public Result<ClientModel> getListByAllByConditionWithPage(
			@RequestParam(required=false,defaultValue="10") int rows, 
			@RequestParam(required=false,defaultValue="1") int page, 
			@RequestParam(required=false,defaultValue="") String sex, 
			@RequestParam(required=false,defaultValue="") String name,
			@RequestParam(required=false,defaultValue="") String address,
			@RequestParam(required=false,defaultValue="") String username, 
			@RequestParam(required=false,defaultValue="") String password) throws Exception{
		Result<ClientModel> result=new Result<ClientModel>();
		if(name!=null&&name.trim().length()>0) {
			name="%"+name+"%";
		System.out.println(name);
		}
		if(username!=null&&username.trim().length()>0) {
			username="%"+username+"%";
		System.out.println(username);
		}
		if(address!=null&&address.trim().length()>0) {
			address="%"+address+"%";
			System.out.println(address);
		}
		result.setPage(page);
		result.setRows(rows);
		result.setCount(cs.getCountByAllByCondition(name, sex, username, password, address));
		result.setPageCount(cs.getPageCountByAllByCondition(name, sex, username, password, address, rows));
		result.setList(cs.getListByAllByConditionWithPage(name, sex, username, password, address, rows, page));

		result.setStatus("ok");
		result.setMessage("取得客户列表分页成功");
		return result;
	}
	
	@GetMapping(value="/get")
	public Result<ClientModel> getByNo(@RequestParam(required = true)int id) throws Exception{
		Result<ClientModel> result=new Result<ClientModel>();
		result.setResult(cs.getClientById(id));
		
		result.setStatus("ok");
		result.setMessage("取得客户成功");
		return result;
	}

	@PostMapping(value = "/cart/add")
	public Result<String> addCart(@RequestBody ClientModel cm) throws Exception {
		int count = cm.getGoods().get(0).getCartCount();
		int id = cm.getId();
		int goid = cm.getGoods().get(0).getGoodsId();
		cs.addCartByIdAndClient(id, goid, count);
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("增加购物车内容成功");
		return result;
	}
	
	@PostMapping(value = "/cart/modify")
	public Result<String> modifyCart(@RequestBody ClientModel cm) throws Exception {
		int count = cm.getGoods().get(0).getCartCount();
		int id = cm.getId();
		int goid = cm.getGoods().get(0).getGoodsId();
		if(count>0) {
			cs.modifyCartByIdAndClient(id, goid, count);
		}
		else {
			cs.deleteCartByIdAndClient(id, goid);;
		}
		Result<String> result = new Result<String>();
		result.setStatus("ok");
		result.setMessage("修改购物车内容成功");
		return result;
	}
	
	@PostMapping(value="/cart/delete")
	public Result<String> deleteCart(@RequestBody ClientModel cm) throws Exception{
		int id = cm.getId();
		int goid = cm.getGoods().get(0).getGoodsId();
		cs.deleteCartByIdAndClient(id, goid);
		Result<String> result=new Result<String>();
		result.setStatus("ok");
		result.setMessage("删除购物车内容成功");
		return result;
	}
	@GetMapping(value="/cart/list/all/page")
	public Result<ClientModel> getCartById(@RequestParam(required = true)int id, @RequestParam(required = false,defaultValue = "10")int rows,@RequestParam(required = false,defaultValue = "1")int page) throws Exception{
		Result<ClientModel> result=new Result<ClientModel>();
		result.setPage(page);
		result.setRows(rows);
		result.setList(cs.getCartListByIdWithGoodsWithPage(id, rows, page));
		result.setStatus("ok");
		result.setMessage("取得购物车列表分页成功");
		return result;
	}
}
