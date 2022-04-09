package plugin;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

import javax.imageio.ImageIO;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Furnace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor;




public class Main extends JavaPlugin implements Listener {

	@Override
	   public void onEnable() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(this, this);
        
		FurnaceRecipe recipe = new FurnaceRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL,1), Material.BRAIN_CORAL);
        
        FurnaceRecipe recipe1 = new FurnaceRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK,1), Material.BRAIN_CORAL_BLOCK);
        
        FurnaceRecipe recipe2 = new FurnaceRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL_FAN,1), Material.BRAIN_CORAL_FAN);
        
        FurnaceRecipe recipe3 = new FurnaceRecipe(new ItemStack(Material.DEAD_BRAIN_CORAL_WALL_FAN,1), Material.BRAIN_CORAL_WALL_FAN);
        
        FurnaceRecipe recipe4 = new FurnaceRecipe(new ItemStack(Material.DEAD_BUBBLE_CORAL,1), Material.BUBBLE_CORAL);
        
        FurnaceRecipe recipe5 = new FurnaceRecipe(new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK,1), Material.BUBBLE_CORAL_BLOCK);
        
        FurnaceRecipe recipe6 = new FurnaceRecipe(new ItemStack(Material.DEAD_BUBBLE_CORAL_FAN,1), Material.BUBBLE_CORAL_FAN);
        
        FurnaceRecipe recipe7 = new FurnaceRecipe(new ItemStack(Material.DEAD_BUBBLE_CORAL_WALL_FAN,1), Material.BUBBLE_CORAL_WALL_FAN);
        
        FurnaceRecipe recipe8 = new FurnaceRecipe(new ItemStack(Material.DEAD_FIRE_CORAL,1), Material.FIRE_CORAL);
        
        FurnaceRecipe recipe9 = new FurnaceRecipe(new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK,1), Material.FIRE_CORAL_BLOCK);
        
        FurnaceRecipe recipe10 = new FurnaceRecipe(new ItemStack(Material.DEAD_FIRE_CORAL_FAN,1), Material.FIRE_CORAL_FAN);
        
        FurnaceRecipe recipe11 = new FurnaceRecipe(new ItemStack(Material.DEAD_FIRE_CORAL_WALL_FAN,1), Material.FIRE_CORAL_WALL_FAN);
        
        FurnaceRecipe recipe12 = new FurnaceRecipe(new ItemStack(Material.DEAD_HORN_CORAL,1), Material.HORN_CORAL);
        
        FurnaceRecipe recipe13 = new FurnaceRecipe(new ItemStack(Material.DEAD_HORN_CORAL_BLOCK,1), Material.HORN_CORAL_BLOCK);
        
        FurnaceRecipe recipe14 = new FurnaceRecipe(new ItemStack(Material.DEAD_HORN_CORAL_FAN,1), Material.HORN_CORAL_FAN);
        
        FurnaceRecipe recipe15 = new FurnaceRecipe(new ItemStack(Material.DEAD_HORN_CORAL_WALL_FAN,1), Material.HORN_CORAL_WALL_FAN);
        
        
        FurnaceRecipe recipe16 = new FurnaceRecipe(new ItemStack(Material.DEAD_TUBE_CORAL,1), Material.TUBE_CORAL);
        
        

        FurnaceRecipe recipe17 = new FurnaceRecipe(new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK,1), Material.TUBE_CORAL_BLOCK);
        
        FurnaceRecipe recipe18 = new FurnaceRecipe(new ItemStack(Material.DEAD_TUBE_CORAL_FAN,1), Material.TUBE_CORAL_FAN);
        
        FurnaceRecipe recipe19 = new FurnaceRecipe(new ItemStack(Material.DEAD_TUBE_CORAL_WALL_FAN,1), Material.TUBE_CORAL_WALL_FAN);
        

        
        
        Bukkit.addRecipe(recipe);
        Bukkit.addRecipe(recipe1);
        Bukkit.addRecipe(recipe2);
        Bukkit.addRecipe(recipe3);
        Bukkit.addRecipe(recipe4);
        Bukkit.addRecipe(recipe5);
        Bukkit.addRecipe(recipe6);
        Bukkit.addRecipe(recipe7);
        Bukkit.addRecipe(recipe8);
        Bukkit.addRecipe(recipe9);
        Bukkit.addRecipe(recipe10);
        Bukkit.addRecipe(recipe11);
        Bukkit.addRecipe(recipe12);
        Bukkit.addRecipe(recipe13);
        Bukkit.addRecipe(recipe14);
        Bukkit.addRecipe(recipe15);
        Bukkit.addRecipe(recipe16);
        Bukkit.addRecipe(recipe17);
        Bukkit.addRecipe(recipe18);
        Bukkit.addRecipe(recipe19);
     
        
	}
	
	
	@Override
	public void onDisable() {
		
	
	}
	


	
	/*
 public MapView mapx = Bukkit.createMap(Bukkit.getWorlds().get(0)); 
public boolean xis = false;	
public ItemStack stack = new ItemStack(Material.FILLED_MAP);
	@EventHandler
	public void llpxfeaax(org.bukkit.event.player.PlayerMoveEvent event) {
	   ItemFrame map = (ItemFrame) event.getPlayer().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.ITEM_FRAME);

	  
	  
	   if (xis == false) {
		   MapMeta meta = (MapMeta) stack.getItemMeta();
		   meta.setMapId(mapx.getId());
	   xis = true;
	
	   
	   
	   
	   
       BufferedImage img;
       try {
    	   URL url = new URL("https://static.spigotmc.org/img/spigot.png");
           img = ImageIO.read(url);
       } catch (IOException e) {
           e.printStackTrace();
           return;
       }
       mapx.setScale(MapView.Scale.NORMAL);
       mapx.addRenderer(new MapRenderer() {
           @Override
           public void render(MapView mapView, MapCanvas mapCanvas, Player player) {
       
                BufferedImage resized = new BufferedImage(126, 126, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g = resized.createGraphics();
               g.drawImage(img, 0, 0, 170, 126, null);
               g.dispose();
        	   
        	   mapCanvas.drawImage(0, 0,resized);
           }});

       stack.setItemMeta(meta);    
	   }   
       map.setInvulnerable(true);
       
       map.setItem(stack);
	   
	}

		
	}		 
			
		
		
	}*/

	
	  
	@EventHandler
	public void llpxfeaax(org.bukkit.event.block.BlockFadeEvent event) {
	 if (event.getBlock().getType() == Material.BRAIN_CORAL ||event.getBlock().getType() == Material.BRAIN_CORAL_BLOCK ||event.getBlock().getType() == Material.BRAIN_CORAL_FAN ||event.getBlock().getType() == Material.BRAIN_CORAL_WALL_FAN ||event.getBlock().getType() == Material.BUBBLE_CORAL ||event.getBlock().getType() == Material.BUBBLE_CORAL_BLOCK ||event.getBlock().getType() == Material.BUBBLE_CORAL_FAN ||event.getBlock().getType() == Material.BUBBLE_CORAL_WALL_FAN ||event.getBlock().getType() == Material.FIRE_CORAL ||event.getBlock().getType() == Material.FIRE_CORAL_BLOCK ||event.getBlock().getType() == Material.FIRE_CORAL_FAN ||event.getBlock().getType() == Material.FIRE_CORAL_WALL_FAN ||event.getBlock().getType() == Material.HORN_CORAL ||event.getBlock().getType() == Material.HORN_CORAL_BLOCK ||event.getBlock().getType() == Material.HORN_CORAL_FAN ||event.getBlock().getType() == Material.HORN_CORAL_WALL_FAN ||event.getBlock().getType() == Material.TUBE_CORAL ||event.getBlock().getType() == Material.TUBE_CORAL_BLOCK ||event.getBlock().getType() == Material.TUBE_CORAL_FAN ||event.getBlock().getType() == Material.TUBE_CORAL_WALL_FAN ) {
		 event.setCancelled(true);
	 }
	}
	
	
	

		
	}


		
		
		

	
	
		
	
		
		
	/*	for (int i = 0; i < nnn.size(); i++) {
			if (nnn.get(i).getClass() == ShulkerBox.class) {
				
				ArrayList<ItemStack> is = new ArrayList<ItemStack>();
				
				
				ShulkerBox sb = (ShulkerBox) nnn.get(i);
				
				
				
					if (sb.getInventory().getContents().length == 27) {
						
					}
				
			}
		}*/
	
	
	

